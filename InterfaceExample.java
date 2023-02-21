public class InterfaceExample {
    public static void main(String args[]){
        Toddler toddler = new Toddler();
        toddler.play();
        toddler.smile();
        System.out.println("--------------------");

        Kindergarden kindergarden = new Kindergarden();
        kindergarden.learn();
        kindergarden.play();
        kindergarden.smile();
        System.out.println("--------------------");

        Teenage teenage = new Teenage();
        teenage.game();
        teenage.learn();
        teenage.smile();
        teenage.play();
        teenage.socialMedia();
    }
}

interface Play{
    void play();
}

interface Smile{
    void smile();
}

interface Learn{
    void learn();
}

interface Game{
    void game();
}

interface SocialMedia{
    void socialMedia();
}

class Toddler implements Play, Smile{

    @Override
    public void play(){
        System.out.println("Toddler is playing with toys");
    }

    @Override
    public void smile(){
        System.out.println("Toddler is smiling");
    }
}

class Kindergarden implements Play, Smile, Learn{
    @Override
    public void play(){
        System.out.println("Kindergarden Kid is playing with toys");
    }

    @Override
    public void smile(){
        System.out.println("Kindergarden Kid is smiling");
    }

    @Override
    public void learn(){
        System.out.println("Kindergarden Kid is learning alphabets");
    }
}

class Teenage implements Play, Smile, Learn, Game, SocialMedia{
    @Override
    public void play(){
        System.out.println("Teenager is playing with friends");
    }

    @Override
    public void smile(){
        System.out.println("Teenager is smiling");
    }

    @Override
    public void learn(){
        System.out.println("Teenager is learning family values");
    }

    @Override
    public void game(){
        System.out.println("Teenager are playing video games");
    }

    @Override
    public void socialMedia(){
        System.out.println("Teenagers always on their phone on social media ");
    }
}