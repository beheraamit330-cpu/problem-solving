import java.util.Arrays;
// import java.util.Collections;

public class Destroying_Asteroids {
    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        for(int astro:asteroids){
            if (mass>=astro) {
                mass +=astro;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] asteroids = {4,9,23,4};
        System.out.println(asteroidsDestroyed(5, asteroids));
    }
}