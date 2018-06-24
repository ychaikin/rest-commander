package test.com.clearlydecoded.commander.discovery.config;

import com.clearlydecoded.commander.CommandHandler;
import org.springframework.stereotype.Service;

@Service
public class Command1Handler implements CommandHandler<Command1, Command1Response> {

  @Override
  public Command1Response execute(Command1 command) {
    // do nothing. handler is just for wiring tests
    return null;
  }

  @Override
  public String getCompatibleCommandType() {
    return new Command1().getType();
  }

  @Override
  public Class<Command1> getCompatibleCommandClassType() {
    return Command1.class;
  }
}
