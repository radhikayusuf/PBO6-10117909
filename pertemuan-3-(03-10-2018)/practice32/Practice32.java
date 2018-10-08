/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program DAFTAR FILM
 *
 */

class Practice32 {

    public static void main(String[] args){

        Film film1 = new Film("Venom", "Action, Horor, scifi", 8.5, 120);
        film1.nowPlaying();

        Film film2 = new Film("Small Foot", "Animation", 9, 96);
        film2.nowPlaying();
        
        Film film3 = new Film("Crazy Poor Asia", "Comedy", 7.8, 119);
        film3.nowPlaying();

        Film film4 = new Film("Asih", "Horor", 6.0, 100);
        film4.nowPlaying();
    }

}