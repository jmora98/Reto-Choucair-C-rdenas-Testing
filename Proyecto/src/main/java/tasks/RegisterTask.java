package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinsterfaces.Register;

public class RegisterTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Register.JOIN));
        actor.attemptsTo(Enter.theValue("Julian").into(Register.FIRS));
        actor.attemptsTo(Enter.theValue("Mora").into(Register.LAST));
        actor.attemptsTo(Enter.theValue("j.mora2.908.0040.0@gmail.com").into(Register.EMAIL));
        actor.attemptsTo(Click.on(Register.MONTH));
        actor.attemptsTo(Click.on(Register.MONTH2));
        actor.attemptsTo(Click.on(Register.DAY));
        actor.attemptsTo(Click.on(Register.DAY2));
        actor.attemptsTo(Click.on(Register.YEAR));
        actor.attemptsTo(Click.on(Register.YEAR2));
        actor.attemptsTo(Click.on(Register.NEXT));
        actor.attemptsTo(Click.on(Register.NEXT2));
        actor.attemptsTo(Click.on(Register.BRAND));
        actor.attemptsTo(Click.on(Register.NEXT3));
        actor.attemptsTo(Enter.theValue("1148144988Jm.").into(Register.PASSWORD));
        actor.attemptsTo(Enter.theValue("1148144988Jm.").into(Register.PASSWORD2));
        actor.attemptsTo(Click.on(Register.CHECK));
        actor.attemptsTo(Click.on(Register.CHECK2));
        actor.attemptsTo(Click.on(Register.NEXT4));

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }


    }

    public static RegisterTask inthepage() {
        return Tasks.instrumented(RegisterTask.class);
    }
}
