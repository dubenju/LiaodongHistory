package javay.distance;

import java.math.BigDecimal;

import javay.distance.city.ModelCity;

public class DistCnvter {

//    private final static double PI = 3.14159265358979323; // 圆周率
    private final static double R = 6371229; // 地球的半径(单位m)
    private final static double R_MAX = 6378137.0; // 赤道半径(a)(单位m)
    private final static double R_MIN = 6356752.3; // 极半径(b)(单位m)

    /**
     * 求两经纬度之间的距离
     * @param lon1 第一点的经度
     * @param lat1 第一点的纬度
     * @param lon2 第二点的经度
     * @param lat3 第二点的纬度
     * @param radius 地球半径
     * @return 返回的距离，单位m 
     * @return
     */
    public static double getDistance(double longt1, double lat1, double longt2, double lat2, double radius) {
        double x, y, distance;
        x = (longt2 - longt1) * Math.PI * radius * Math.cos(((lat1 + lat2) / 2) * Math.PI / 180) / 180;
        y = (lat2 - lat1) * Math.PI * radius / 180;
        distance = Math.hypot(x, y);
        return distance;
    }

    /** 
     * 转化为弧度(rad) 
     * */  
    public static double rad(double d) {
       return d * Math.PI / 180.0; 
    }

    /** 
     * 基于googleMap中的算法得到两经纬度之间的距离,计算精度与谷歌地图的距离精度差不多，相差范围在0.2米以下 
     * @param lon1 第一点的经度
     * @param lat1 第一点的纬度
     * @param lon2 第二点的经度
     * @param lat3 第二点的纬度
     * @param radius 地球半径
     * @return 返回的距离，单位m 
     * */  
    public static double GetDistance(double lon1,double lat1,double lon2, double lat2, double radius) {
       double radLat1 = rad(lat1);
       double radLat2 = rad(lat2);
       double a = radLat1 - radLat2;
       double b = rad(lon1) - rad(lon2);
       double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2)+Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)));
       s = s * radius;
//       s = Math.round(s * 10000) / 10000;
       return s;
    }

    public static double getEarthRadius(double lat1, double lat2) {
        return R_MIN + (R_MAX - R_MIN) * (Math.abs(lat1) + Math.abs(lat2)) / 180;
    }
    /**
     * 基于余弦定理求两经纬度距离
     * @param lon1 第一点的经度
     * @param lat1 第一点的纬度
     * @param lon2 第二点的经度
     * @param lat3 第二点的纬度
     * @param radius 地球半径
     * @return 返回的距离，单位m 
     * */
    public static double lantitudeLongitudeDist(double lon1, double lat1,double lon2, double lat2, double radius) {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);

        double radLon1 = rad(lon1);
        double radLon2 = rad(lon2);

        if (radLat1 < 0) radLat1 = Math.PI / 2 + Math.abs(radLat1);// south
        if (radLat1 > 0) radLat1 = Math.PI / 2 - Math.abs(radLat1);// north
        if (radLon1 < 0) radLon1 = Math.PI * 2 - Math.abs(radLon1);// west
        if (radLat2 < 0) radLat2 = Math.PI / 2 + Math.abs(radLat2);// south
        if (radLat2 > 0) radLat2 = Math.PI / 2 - Math.abs(radLat2);// north
        if (radLon2 < 0) radLon2 = Math.PI * 2 - Math.abs(radLon2);// wes

        double x1 = radius * Math.cos(radLon1) * Math.sin(radLat1);
        double y1 = radius * Math.sin(radLon1) * Math.sin(radLat1);
        double z1 = radius * Math.cos(radLat1);

        double x2 = radius * Math.cos(radLon2) * Math.sin(radLat2);
        double y2 = radius * Math.sin(radLon2) * Math.sin(radLat2);
        double z2 = radius * Math.cos(radLat2);

        double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)+ (z1 - z2) * (z1 - z2));
        //余弦定理求夹角  
        double theta = Math.acos((radius * radius + radius * radius - d * d) / (2 * radius * radius));
        double dist = theta * radius;
        return dist;
    }

    public static double getDistance(ModelCity city1, ModelCity city2) {
        double result = GetDistance(city1.getLongitude(), city1.getAtitude(), city2.getLongitude(), city2.getAtitude(), R_MAX);
        BigDecimal temp = new BigDecimal(Double.toString(result));
        return temp.setScale(0, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        // 丹东市宽甸满族自治县宽甸客运站 124.77893829345705， 40.72560011057546
        // 丹东市宽甸满族自治县灌水客运站-停车场124.57654953002931
        // 丹东市凤城市凤城中心客运站 124.05967712402345
        // 从宽甸满族自治县到凤城市的直线(飞行路线)距离为67公里
        // 灌水到凤城约80公里

        // 0.131km
//        ModelCity city = new ModelCity("", 139.60066102445128, 35.45615269127609, 0);
//        ModelCity city2 = new ModelCity("", 139.59945403039458, 35.45678109747813, 0);
        // 460m
        ModelCity city = new ModelCity("", 139.6729512512684, 35.45304363331872, 0);
        ModelCity city2 = new ModelCity("", 139.6753638982773, 35.45668332751792, 0);
        // 54m
//        ModelCity city = new ModelCity("", 139.67535182833674, 35.456137124436935, 0);
//        ModelCity city2 = new ModelCity("", 139.67563480138782, 35.45656261695621, 0);
        // double earthRadius = getEarthRadius(40.87867241696903, 40.45171508652637);
        double earthRadius = R_MAX;
        System.out.println(getDistance(city.getLongitude(), city.getAtitude(), city2.getLongitude(), city2.getAtitude(), earthRadius));
        System.out.println(GetDistance(city.getLongitude(), city.getAtitude(), city2.getLongitude(), city2.getAtitude(), earthRadius));
        System.out.println(lantitudeLongitudeDist(city.getLongitude(), city.getAtitude(), city2.getLongitude(), city2.getAtitude(), earthRadius));

        System.out.println(getDistance(city, city2));
    }
}
