
import net.dv8tion.jda.client.entities.Group;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.exceptions.PermissionException;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;
import java.util.List;
import java.util.Random;

public class DiscordTestBot extends ListenerAdapter {
    
    public static void main(String[] args) {
        
        try {
            JDA jda = new JDABuilder(AccountType.BOT)
                    .setToken("bot token goes here")           
                    .addListener(new DiscordTestBot())  
                    .buildBlocking(); 
        }
        catch (LoginException e) {    
            
            e.printStackTrace();
        }
        catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        catch (RateLimitedException e) {
            e.printStackTrace();
        }
    }
  
}
