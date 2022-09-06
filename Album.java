import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name ;
    private String artist ;
    private ArrayList<Songs> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>() ;
    }

    public boolean addSong(String title , double duration){
        if(findSong(title) == null){
            songs.add(new Songs(title,duration));
            System.out.println( title+ " Song Added Duration :" + duration);
            return true ;
        }
        return false ;
    }

    public Songs findSong(String song){
        for(int i = 0 ; i< songs.size(); i++){
            Songs existingSong = this.songs.get(i) ;
            if(existingSong.getTitle().equals(song)){
                return existingSong ;
            }
        }
        return null ;
    }

    public boolean addToPlayList(String title , LinkedList<Songs> playlist){
        for(int i = 0 ; i< songs.size(); i++){
            Songs existingSong = this.songs.get(i) ;
            if(existingSong.getTitle().equals(title)){
                playlist.add(songs.get(i)) ;
                return true ;
            }
        }
        return false ;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Songs> playlist){
        int index = trackNumber - 1 ;
        if(index >= 0 && index < this.songs.size()){
            playlist.add(songs.get(index)) ;
            return true ;
        }
        return false ;
    }


}
