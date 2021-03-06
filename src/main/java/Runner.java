import db.DBGolfer;
import models.Golfer;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Justin", "Rose", 37);
        Golfer golfer2 = new Golfer("Tiger", "Woods", 43);
        DBGolfer.save(golfer1);
        DBGolfer.save(golfer2);
        golfer1.setAge(38);
        DBGolfer.update(golfer1);
        DBGolfer.delete(golfer1);
        List<Golfer> golfers = DBGolfer.getGolfers();
    }
}
