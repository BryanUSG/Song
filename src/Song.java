public class Song
{
    //1) Class or Instance variables
    private String title;
    private String artist;
    private boolean hasChorus;
    private int tempo;
    private double playTime;

    //2) Constructors
    public Song(String title, String artist, boolean hasChorus, int tempo, double playTime)
    {
        this.title = title;
        this.artist = artist;
        this.hasChorus = hasChorus;
        this.tempo = tempo;
        this.playTime = playTime;
    }//end full constructor
    //Overloaded constructor - must be different by type in the parameter list

    public Song( String myArtist, boolean myHasChorus, String myTitle, int myTempo, double time)
    {
        title = myTitle;
        artist = myArtist;
        hasChorus = myHasChorus;
        tempo = myTempo;
        playTime = time;
        //numSongs++;
    }//end full constructor

    public Song()
    {
        //title = ""; empty string, frequently used as a default value
        title = "title goes here";
        artist = "none"; //String types can be null or empty
        hasChorus = false; //typical default for a boolean type
        tempo = 0; //typical default for a number type
        playTime = 0.0;
    }//end default constructor

    //4) Getter = allow the client (main method) to access instance variables
    public String getTitle()
    {
        return title;
    }//end title getter (accessor)

    public String getArtist()
    {
        return artist;
    }//end artist getter

    public int getTempo()
    {
        return tempo;
    }//end tempo getter

    //public static int getNumSongs(){return numSongs};

    //5) Setters (aka mutators)
    public void setTempo(int myTempo)
    {
        tempo = myTempo;
    }//end tempo setter

    //6) Brain Methods
    //Convert the playTime into seconds
    public int playTimeSeconds()
    {
        int minuteInSeconds = 60 *(int)(playTime);
        //subtract minute part to get second part
        double something = playTime - (int)(playTime);
        int seconds = (int)(playTime * 100) % 100;
                //gets the minute part into seconds
        return seconds + minuteInSeconds;
    }

    //3) ToString
    public String toString()
    {
        String output = "Title: " + title +
                "\nArtist: " + artist +
                "\nHas a Chorus: " + hasChorus +
                "\nTempo: " + tempo +
                "\nPlay time: " + playTime;
        return output;
    }
}//end song class
