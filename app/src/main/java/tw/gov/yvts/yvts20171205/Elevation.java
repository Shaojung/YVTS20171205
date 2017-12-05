package tw.gov.yvts.yvts20171205;

/**
 * Created by yvtc on 2017/12/5.
 */

public class Elevation {
    public MyResult[] results;
    public String status;
}

class MyLocation
{
    public double lat;
    public double lng;
}
class MyResult
{
    public double elevation;
    public MyLocation location;
    public double resolution;
}