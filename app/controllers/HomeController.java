package controllers;

import play.mvc.*;

import views.html.*;

public class HomeController extends Controller {

    public Result index() {
        System.out.println("test world");
        return ok(index.render("Your new application is ready."));
    }

}
