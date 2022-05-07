package Operations;

import Errors.NotEnoughValuesInStack;

import java.util.List;

public class Print implements Operation {
    @Override
    public void execute(Context ctx, List<String> args) throws NotEnoughValuesInStack {
        if(ctx.size()<1) {
            throw new NotEnoughValuesInStack("PRINT");
        }
        System.out.println(ctx.peek());
    }
}