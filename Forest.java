import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jjjjj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest extends World
{
    public Forest()
    {    
        super(1200, 1700, 1); 
        
        addObject(new Car(),844,522);
        //Forest***********************************
        addObject(new Mountain1(),93,93);
        addObject(new Elephant1(),730,337);
        addObject(new Lion1(),462,436);
        addObject(new LION2(),1084,393);
        addObject(new Deer1(),24,250);
        addObject(new Deer2(),26,250);
        addObject(new Deer3(),124,261);
        addObject(new Deer4(),132,236);
        addObject(new Deer5(),236,260);
        
        addObject(new Deer6(),194,242);
        //addObject(new Deer1(),610,259);
        //addObject(new Deer1(),620,446);
        addObject(new TREE1(),285,84);
        addObject(new TREE1(),165,72);
        addObject(new TREE2(),815,168);
        addObject(new TREE3(),1016,321);
        addObject(new TREE4(),506,405);
        /*addObject(new TREE1(),24,618);
        addObject(new TREE1(),314,688);
        addObject(new TREE1(),716,635);
        addObject(new TREE1(),1162,643);*/
        addObject(new TREE7(),789,312);
        addObject(new TREE8(),1156,106);
        addObject(new TREE6(),1102,506);
        
        
        addObject(new WALL(),479,653);
        addObject(new WALL(),703,653);
        addObject(new WALL(),161,653);
        addObject(new WALL(),1179,653);
        addObject(new ZEBRA2(),991,141);
        addObject(new BOARD2(),795,644);
        //*********************************
        
        addObject(new GRASS3(),314,1004);
        addObject(new GRASS3(),474,1004);
        addObject(new CoconutTree(),70,754);
        addObject(new BIRD2(),665,105);
        addObject(new CHEETAH1(),331,156);
        addObject(new TIGER1(),34,403);
        addObject(new TIGER2(),849,447);
        addObject(new BUFFALO1(),683,204);
        addObject(new ZEBRA1(),912,322);
        addObject(new BEER1(),1168,541);
        addObject(new GIRAFFE1(),893,231);
        addObject(new FOX1(),1109,154);
        /*for(int i=1;i<=10;i++)
        {
            int x=Greenfoot.getRandomNumber(306);
            int y=Greenfoot.getRandomNumber(930);
            addObject(new BLACK(),x,y);
  
        }*/
        /*addObject(new BLACK(),553,934);
        addObject(new BLACK(),557,938);
        addObject(new BLACK(),555,940);
        addObject(new BLACK(),476,912);
        addObject(new BEER1(),375,946);*/
        
        

        //River************************************
        addObject(new River(),306,930);
        addObject(new Bridge(),933,976);
        addObject(new BOAT1(),419,860);
        addObject(new BOAT2(),71,885);
        addObject(new BIRD3(),360,46);
        
        //City*************************************
        addObject(new ROAD1(),169,1472);
        addObject(new ROAD3(),824,1275);
        addObject(new ROAD3(),1023,1139);
        addObject(new ROAD1(),169,1472);
        addObject(new ROAD1(),688,1135);
        addObject(new ROAD1(),501,1472);
        addObject(new ROAD1(),684,1472);
        addObject(new Factory(),76,1176);
        addObject(new CITY(),514,1196);
        addObject(new Under(),953,1206);
        addObject(new Trafic(),1053,1354);
        addObject(new UnderWorking(),883,1288);
        addObject(new UnderWorking2(),950,1288);
        addObject(new UnderWorking3(),1010,1287);
        addObject(new BUS1(),79,1600);
        addObject(new BUS2(),1057,1470);
        addObject(new BUS3(),759,1602);
        addObject(new BUS4(),324,1480);
        addObject(new CAR1(),520,1619);
        addObject(new Ambulance(),712,1532);
        addObject(new Police(),1087,1596);
        addObject(new CAR2(),47,1519);
        addObject(new CAR3(),1073,1530);
        addObject(new MAN1(),201,1410);
        addObject(new MAN2(),467,1376);
        addObject(new MAN3(),815,1412);
        addObject(new MAN4(),78,1381);
        addObject(new Divider(),752,1571);
    }
}
