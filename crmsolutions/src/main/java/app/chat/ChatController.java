package app.chat;

import app.util.Path;
import io.javalin.Handler;

public class ChatController {
    public static Handler serveChatPage = ctx -> {
        //ctx.render(Path.Template.CHATWS);
        ctx.render(Path.Template.CHAT);
    };
}
