import java.util.HashMap;
import java.util.List;
import java.util.Map;


import dao.Sql2oUserDao;
import dao.UserDao;
import models.User;
import org.sql2o.Sql2o;
import spark.template.handlebars.HandlebarsTemplateEngine;
import spark.ModelAndView;
import static spark.Spark.*;



public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        //Database
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/database.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        Sql2oUserDao userDao = new Sql2oUserDao(sql2o);

        //default home route
        get("/", (req, res) ->{
            Map<String, Object> data = new HashMap<>();
            return new ModelAndView(data, "index.hbs");
        }, new HandlebarsTemplateEngine());

        //registration form
        get("/registration", (req, res) ->{
            Map<String, Object> data = new HashMap<>();
            return new ModelAndView(data, "registration.hbs");
        }, new HandlebarsTemplateEngine());

        //post user
        post("/login", (req, res) ->{
            Map<String, Object> data = new HashMap<>();
            String firstName = req.queryParams("firstName");
            String lastName = req.queryParams("lastName");
            String email = req.queryParams("email");
            Integer mobile = Integer.parseInt(req.params("mobile"));
            String password = req.queryParams("password");
            User user = new User(firstName, lastName, email, mobile, password);
            userDao.add(user);
            return new ModelAndView(data, "login.hbs");
        }, new HandlebarsTemplateEngine());

        //get user profile
        get("/profile", (req, res) ->{
            Map<String, Object> data = new HashMap<>();
            int userId = Integer.parseInt(req.params("id"));
            User user = userDao.findById(userId);
            data.put("user", user);
            return new ModelAndView(data, "profile.hbs");
        }, new HandlebarsTemplateEngine());

        get("/login", (req, res) ->{
            Map<String, Object> data = new HashMap<>();
            return new ModelAndView(data, "login.hbs");
        }, new HandlebarsTemplateEngine());

        post("/profile", (req, res) ->{
            Map<String, Object> data = new HashMap<>();
            String email = req.queryParams("email");
            String password = req.queryParams("password");
            User user = (User) userDao.getAll();
            if(email.equals(user.getEmail()) && password.equals(user.getPassword())){
                return new ModelAndView(data, "profile.hbs");
            }
            return new ModelAndView(data, "login.hbs");
        }, new HandlebarsTemplateEngine());

    }
}
