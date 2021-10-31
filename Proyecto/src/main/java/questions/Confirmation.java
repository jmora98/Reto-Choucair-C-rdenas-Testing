package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinsterfaces.Register;

public class Confirmation implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        String message= Register.CONFIRMATION.resolveFor(actor).getText(); // Traigame el texto y retorna el mensaje.
        return message;

    }

    public  static Confirmation textfinish () {
        return new Confirmation();

    }
}
