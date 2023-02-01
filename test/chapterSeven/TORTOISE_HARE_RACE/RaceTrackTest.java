package chapterSeven.TORTOISE_HARE_RACE;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class RaceTrackTest {

//    private RaceTrack raceTrack;
//
//    @BeforeEach
//    public void setUp(){
//        raceTrack=new RaceTrack();
//    }
//
//
//
//    @Test
//    public void testThatRaceTrackExists(){
//        assertNotNull(raceTrack);
//    }
//
//    @Test
//    public void testThatRaceTrackLaneHas_70_Squares(){
//        String[][] lanes = raceTrack.getLanes();
//        String[] laneOne=lanes[0];
//        String[] laneTwo=lanes[1];
//        assertEquals(70, laneOne.length);
//        assertEquals(70, laneTwo.length);
//
//    }
//
//    @Test
//    public void testThatRaceTrackLaneSquareIsBlankByDefault(){
//        String[][] lanes = raceTrack.getLanes();
//        for (String[] lane : lanes) {
//            for (int counter = 1; counter < lane.length; counter++) {
//                assertEquals(raceTrack.getBlankSpace(), lane[counter]);
//            }
//        }
//    }
//
//    @Test
//    public void testTortoiseFastPlodMove(){
//        raceTrack.move(5);
//        String[] tortoiseLane = raceTrack.getLanes()[raceTrack.getTortoiseLane()];
//        assertEquals(raceTrack.getTortoise(), tortoiseLane[3]);
//    }
//
//    @Test
//    public void testTortoiseSlipMove(){
//        raceTrack.move(3);
//        raceTrack.move(7);
//        String[] tortoiseLane = raceTrack.getLanes()[raceTrack.getTortoiseLane()];
//        assertEquals(raceTrack.getTortoise(), tortoiseLane[0]);
//    }
//
//
//    @Test
//    void testTortoiseMakesSlipMoveAtCell_9(){
//        raceTrack.move(5);
//        raceTrack.move(5);
//        raceTrack.move(5);
//        String[] tortoiseLane = raceTrack.getLanes()[raceTrack.getTortoiseLane()];
//        raceTrack.move(6);
//        assertEquals(raceTrack.getTortoise(), tortoiseLane[3]);
//    }
//
//    @Test
//    void testTortoiseMakesSlipMoveAtCell_8(){
//        raceTrack.move(5);
//        raceTrack.move(5);
//        raceTrack.move(9);
//        raceTrack.move(9);
//        raceTrack.move(6);
//        String[] tortoiseLane = raceTrack.getLanes()[raceTrack.getTortoiseLane()];
//        assertEquals(raceTrack.getTortoise(), tortoiseLane[2]);
//    }
//    @Test
//    public void testTortoiseSlowPlodMove(){
//        raceTrack.move(9);
//        String[] tortoiseLane = raceTrack.getLanes()[raceTrack.getTortoiseLane()];
//        assertEquals(raceTrack.getTortoise(), tortoiseLane[1]);
//    }
//
//    @Test
//    public void testHareSleepMove(){
//        int hareLaneIndex =raceTrack.getHareLane();
//        String[] hareLane = raceTrack.getLanes()[hareLaneIndex];
//        raceTrack.move(1);
//        assertEquals(raceTrack.getHare(), hareLane[0]);
//    }
//
//    @Test
//    public void testHareBigHopMove(){
//        int hareLaneIndex =raceTrack.getHareLane();
//        String[] hareLane = raceTrack.getLanes()[hareLaneIndex];
//        raceTrack.move(3);
//        assertEquals(raceTrack.getHare(), hareLane[9]);
//    }
//
//    @Test
//    public void testHareBigSlipMove(){
//        int hareLaneIndex =raceTrack.getHareLane();
//        String[] hareLane = raceTrack.getLanes()[hareLaneIndex];
//        raceTrack.move(3);
//        raceTrack.move(5);
//        assertEquals(raceTrack.getHare(), hareLane[0]);
//    }
//
//    @Test
//    public void testHareSmallHopMove(){
//        int hareLaneIndex =raceTrack.getHareLane();
//        String[] hareLane = raceTrack.getLanes()[hareLaneIndex];
//        raceTrack.move(7);
//        assertEquals(raceTrack.getHare(), hareLane[1]);
//    }
//
//    @Test
//    public void testHareSmallSlipMove(){
//        int hareLaneIndex =raceTrack.getHareLane();
//        String[] hareLane = raceTrack.getLanes()[hareLaneIndex];
//        raceTrack.move(4);
//        raceTrack.move(9);
//        assertEquals(raceTrack.getHare(), hareLane[7]);
//    }
//
//    @Test
//    public void testAnimalMoveStaysWithinTrackBound(){
//        int hareLaneIndex =raceTrack.getHareLane();
//        String[] hareLane = raceTrack.getLanes()[hareLaneIndex];
//        for (int i = 0; i < 8; i++) {
//            raceTrack.move(3);
//        }
//        assertEquals(raceTrack.getHare(), hareLane[69]);
//    }

}