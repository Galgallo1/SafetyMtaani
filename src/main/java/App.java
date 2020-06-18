


import org.sql2o.Sql2o;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Crime;
import model.dao.Sql2oCrimeDao;

import static spark.Spark.*;

public class App {


    public static void main(String[] args) {

        staticFileLocation("/public");


        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/database.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        Sql2oCrimeDao sql2oCrimeDao = new Sql2oCrimeDao(sql2o);

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/new-crime", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String crime = request.queryParams("crime");
            String location = request.queryParams("location");
            String reportedBy = request.queryParams("reportedBy");
            int contact = Integer.parseInt(request.queryParams("contact"));
            Crime crimeInstance = new Crime(crime,location,reportedBy,contact);
            sql2oCrimeDao.Add(crimeInstance);
            response.redirect("/all-crimes");
            return null;
        }, new HandlebarsTemplateEngine());

        get("/all-crimes",(request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Crime> crimes = sql2oCrimeDao.getAll();
            model.put("crimes", crimes);
            return new ModelAndView(model, "all-crimes.hbs");
        }, new HandlebarsTemplateEngine());

        get("/new-crime", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "new-crime.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
