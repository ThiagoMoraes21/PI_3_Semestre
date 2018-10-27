package app.dashboard;

import app.util.Path;
import io.javalin.Handler;

public class DashboardController {
    public static Handler serveDashboardPage = ctx -> {
        ctx.render(Path.Template.DASHBOARD);
    };
}
