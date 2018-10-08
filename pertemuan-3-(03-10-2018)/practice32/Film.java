class Film {

    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;


    public Film(String filmName, String filmGenre, double filmRating, int filmDuration){
        this.filmName = filmName;
        this.filmGenre = filmGenre;
        this.filmRating = filmRating;
        this.filmDuration = filmDuration;
    }

    public void nowPlaying(){
        System.out.println("Judul Film : ".concat(filmName));
        System.out.println("Genre Film : ".concat(filmGenre));
        System.out.println("Rating Film : ".concat(String.valueOf(filmRating)));
        System.out.println("Duration Film : ".concat(String.valueOf(filmDuration).concat(" Menit")));
        System.out.println();
    }


}