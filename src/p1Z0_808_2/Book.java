package p1Z0_808_2;

interface Readable extends Downloadable{
    
        public void readBook();
        //public void setBookMark();
    
}

abstract class Book implements Readable{
    public void readBook () {
        System.out.println("Read Book");
    };


}

/**
 * InnerBook
 */
interface Downloadable  {
    public void download();
    
}
