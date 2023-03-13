package Gun39._05_OOPSoru1;

public class TechnoKitchen {
    public static void hazirla(IFood f) {

        System.out.println(f.getClass().getSimpleName());

        if (f instanceof AdanaKabab) {
            ((AdanaKabab) f).marine();
            ((AdanaKabab) f).grill();

        } else if (f instanceof Lahmacun) {
            ((Lahmacun) f).dough();
            ((Lahmacun) f).addMeat();
            ((Lahmacun) f).bake();

        } else if (f instanceof Borsh) {
            ((Borsh) f).boil();
            ((Borsh) f).eatTomorrow();
        } else if (f instanceof Pilav) {
            ((Pilav) f).fry();
            ((Pilav) f).boil();
        }
        f.taste();
        System.out.println();
    }
}
