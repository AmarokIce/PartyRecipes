package com.someoneice.partyrecipes.Init;

import com.someoneice.partyrecipes.Effect.Cofe;
import com.someoneice.partyrecipes.Effect.JsSoda;
import com.someoneice.partyrecipes.Effect.Sweet;
import com.someoneice.partyrecipes.Effect.TsSoda;

public class Effectlist {
    public static JsSoda jsSoda() {
        return new JsSoda();
    }
    public static Sweet sweet() {
        return new Sweet();
    }
    public static TsSoda tssoda() {
        return new TsSoda();
    }
    public static Cofe Cofe() {
        return new Cofe();
    }
}
