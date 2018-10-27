package app;

import app.chat.ChatController;
import app.dashboard.DashboardController;
import app.util.Path;
import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create()
                .enableStaticFiles("/public")
                .enableStaticFiles("/chat")
                .start(7070);

        app.get("/", ctx -> ctx.result("HOME PAGE!"));
        app.get(Path.Web.CHAT, ChatController.serveChatPage);
        app.get(Path.Web.DASHBOARD, DashboardController.serveDashboardPage);


        app.error(404, ctx -> ctx.result("ERROR 404 PAGE NOT FOUND!"));
    }
}
