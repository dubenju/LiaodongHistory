/**
 *
 */
package javay.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javay.distance.city.ModelCity;

/**
 * @author DBJ
 * https://map.51240.com/kuandianzhen__map/
 */
public class UCity {
  private static Map<String, ModelCity> modelCities = new HashMap<String, ModelCity>();
  static {
    modelCities.put("北京" , new ModelCity("北京", 116.41667, 39.91667, 31.2));
    modelCities.put("上海" , new ModelCity("上海", 121.43333, 31.13, 4.5));
    modelCities.put("天津" , new ModelCity("天津", 117.2, 39.13333, 3.3));
    modelCities.put("重庆" , new ModelCity("重庆", 106.547565, 29.548940, 259.1));
    modelCities.put("哈尔滨" , new ModelCity("哈尔滨", 126.63333, 45.75, 171.7)); // ★
    modelCities.put("长春" , new ModelCity("长春", 125.35, 43.88333, 236.8));
    modelCities.put("呼和浩特" , new ModelCity("呼和浩特", 111.65, 40.82, 1063));
    modelCities.put("石家庄" , new ModelCity("石家庄", 114.48333, 38.03333, 80.5));
    modelCities.put("乌鲁木齐" , new ModelCity("乌鲁木齐", 87.68333, 43.76667, 917.9));
    modelCities.put("兰州" , new ModelCity("兰州", 103.73333, 36.03333, 1520));
    modelCities.put("西宁" , new ModelCity("西宁", 101.75, 36.56667, 2261.2));
    modelCities.put("西安" , new ModelCity("西安", 108.95, 34.26667, 396.9));
    modelCities.put("银川" , new ModelCity("银川", 106.26667, 38.46667, 1111.5));
    modelCities.put("郑州" , new ModelCity("郑州", 113.65, 34.76667, 110.4));
    modelCities.put("济南" , new ModelCity("济南", 117.02, 36.65, 51.6));
    modelCities.put("太原" , new ModelCity("太原", 112.53333, 37.86667, 777.9));
    modelCities.put("合肥" , new ModelCity("合肥", 117.27, 31.86, 29.8));
    modelCities.put("武汉" , new ModelCity("武汉", 114.31667, 30.51667, 23.3));
    modelCities.put("长沙" , new ModelCity("长沙", 113, 28.21667, 44.9));
    modelCities.put("南京" , new ModelCity("南京", 118.78333, 32.05, 8.9));
    modelCities.put("成都" , new ModelCity("成都", 104.06667, 30.66667, 505.9));
    modelCities.put("贵阳" , new ModelCity("贵阳", 106.71667, 26.56667, 1071.2));
    modelCities.put("昆明" , new ModelCity("昆明", 102.73333, 25.05, 1891.4));
    modelCities.put("南宁" , new ModelCity("南宁", 108.33, 22.84, 72.2));
    modelCities.put("拉萨" , new ModelCity("拉萨", 91, 29.6, 3658)); // ★
    modelCities.put("杭州" , new ModelCity("杭州", 120.155058, 30.273993, 41.7));
    modelCities.put("南昌" , new ModelCity("南昌", 115.9, 28.68333, 46.7));
    modelCities.put("广州" , new ModelCity("广州", 113.23333, 23.16667, 6.6));
    modelCities.put("福州" , new ModelCity("福州", 119.3, 26.08333, 84));
    modelCities.put("台北" , new ModelCity("台北", 121.5, 25.05, 9));
    modelCities.put("海口" , new ModelCity("海口", 110.35, 20.01667, 14.1)); // ★
    modelCities.put("香港" , new ModelCity("香港", 114.1, 22.2, 32));
    modelCities.put("澳门" , new ModelCity("澳门", 113.5, 22.2, 48.1));
    modelCities.put("青岛" , new ModelCity("青岛", 120.33333, 36.06667, 76));
    modelCities.put("深圳" , new ModelCity("深圳", 114.07, 22.62, 76));
     modelCities.put("吉林" , new ModelCity("吉林", 126.57, 43.87, 76));
    modelCities.put("廊坊" , new ModelCity("廊坊", 116.65, 39.53, 0));
    modelCities.put("沧州" , new ModelCity("沧州", 116.6333333, 38.33, 0));
    modelCities.put("德州" , new ModelCity("德州", 116.29, 37.45, 0));
    modelCities.put("泰安" , new ModelCity("泰安", 117.13, 36.18, 0));
    modelCities.put("曲阜" , new ModelCity("曲阜", 116.98, 35.59, 0));
    modelCities.put("滕州" , new ModelCity("滕州", 117.0916667, 35.05833333, 0));
    modelCities.put("枣庄" , new ModelCity("枣庄", 117.57, 34.86, 0));
    modelCities.put("徐州" , new ModelCity("徐州", 117.2, 34.26, 0));
    modelCities.put("宿州" , new ModelCity("宿州", 116.97, 33.63, 0));
    modelCities.put("蚌埠" , new ModelCity("蚌埠", 117.34, 32.93, 0));
    modelCities.put("定远" , new ModelCity("定远", 117.68, 32.52, 0));
    modelCities.put("滁州" , new ModelCity("滁州", 118.31, 32.33, 0));
    modelCities.put("镇江" , new ModelCity("镇江", 119.44, 32.2, 0));
    modelCities.put("丹阳" , new ModelCity("丹阳", 119.55, 32, 0));
    modelCities.put("常州" , new ModelCity("常州", 119.95, 31.79, 0));
    modelCities.put("无锡" , new ModelCity("无锡", 120.29, 31.59, 0));
    modelCities.put("苏州" , new ModelCity("苏州", 120.62, 31.32, 0));
    modelCities.put("昆山" , new ModelCity("昆山", 120.95, 31.39, 0));
    modelCities.put("咸宁" , new ModelCity("咸宁", 114.28, 29.87, 0));
    modelCities.put("赤壁" , new ModelCity("赤壁", 113.88 , 29.72, 0));
    modelCities.put("岳阳" , new ModelCity("岳阳", 113.09, 29.37, 0));
    modelCities.put("汨罗" , new ModelCity("汨罗", 113.08, 28.8, 0));
    modelCities.put("株洲" , new ModelCity("株洲", 113.16, 27.83, 0));
    modelCities.put("衡山" , new ModelCity("衡山", 112.86, 27.25, 0));
    modelCities.put("衡阳" , new ModelCity("衡阳", 112.61, 26.89, 0));
    modelCities.put("耒阳" , new ModelCity("耒阳", 112.85, 26.42, 0));
    modelCities.put("郴州" , new ModelCity("郴州", 113, 25.79, 0));
    modelCities.put("韶关" , new ModelCity("韶关", 113.597507, 24.810346, 0));
    modelCities.put("清远" , new ModelCity("清远", 113.056042, 23.681525, 0));
    modelCities.put("双城" , new ModelCity("双城", 126.32, 45.53, 0));
    modelCities.put("扶余" , new ModelCity("扶余", 126.02 ,44.98, 0));
    modelCities.put("德惠" , new ModelCity("德惠", 125.68, 44.52, 0));
    modelCities.put("公主岭" , new ModelCity("公主岭", 124.82, 43.5, 0));

    modelCities.put("沈阳" , new ModelCity("沈阳", 123.43147695064546, 41.80572762407383, 41.6));
    modelCities.put("沈阳卫" , new ModelCity("沈阳卫", 123.43530178070076, 41.80499785946003, 41.6));
    modelCities.put("奉集堡" , new ModelCity("奉集堡", 123.56838762760162, 41.56951531213839, 41.6));
    modelCities.put("静远堡" , new ModelCity("静远堡", 123.1796979904175, 41.89652735762414, 41.6));
    modelCities.put("平虏堡" , new ModelCity("平虏堡", 123.33820581436159, 41.93709148907372, 41.6));
    modelCities.put("上榆林堡" , new ModelCity("上榆林堡", 123.26229929924013, 42.03579726890349, 41.6));
    modelCities.put("蒲河城" , new ModelCity("蒲河城", 123.59411001205446, 41.95346630889265, 0));
    modelCities.put("十方寺堡" , new ModelCity("十方寺堡", 123.3511769771576, 42.12717306514722, 0));

    modelCities.put("四平" , new ModelCity("四平", 124.37, 43.17, 0));
    modelCities.put("昌图" , new ModelCity("昌图", 124.13, 42.8, 0));
     modelCities.put("铁岭" , new ModelCity("铁岭", 123.85, 42.32, 0));
    modelCities.put("铁岭卫" , new ModelCity("铁岭卫", 123.7259888648987, 42.22376246385111, 0));
    modelCities.put("懿路城" , new ModelCity("懿路城", 123.65565061569215, 42.10236983167844, 0));
    modelCities.put("丁字泊堡" , new ModelCity("丁字泊堡", 123.51387977600099, 42.163983959363044, 0));
    modelCities.put("三岔儿堡" , new ModelCity("三岔儿堡", 123.9902186393738, 42.05120466586921, 0));
    modelCities.put("泛河城" , new ModelCity("泛河城", 123.70062589645387, 42.24064726355983, 0));
    modelCities.put("宋家泊堡" , new ModelCity("宋家泊堡", 123.61479520797731, 42.238897825192936, 0));
    modelCities.put("▼白家冲堡" , new ModelCity("▼白家冲堡", 123.96776318550111, 42.130908825161455, 0));
    /* 铁岭市铁岭县增盛堡村 */
    modelCities.put("曾迟堡" , new ModelCity("曾迟堡", 123.70021820068361, 42.31362368943786, 0));
    modelCities.put("抚安堡" , new ModelCity("抚安堡", 124.05387282371522, 42.198289689278205, 0));
    /* 镇西堡遗址在此前的农村供销社与镇小学之间，城址南北墙长约300米、东西墙长约240米，北墙在镇小学的操场内 */
    modelCities.put("▼镇西堡" , new ModelCity("▼镇西堡", 123.7638294696808, 42.3618022404757, 0));
    modelCities.put("▼彭家湾堡" , new ModelCity("▼彭家湾堡", 123.88561248779298, 42.376173312846625, 0));
    modelCities.put("中固城" , new ModelCity("中固城", 124.00675177574159, 42.43851421631892, 0));
    modelCities.put("定远堡" , new ModelCity("定远堡", 123.83995056152345, 42.452788566458096, 0));
    modelCities.put("柴河堡" , new ModelCity("柴河堡", 124.17216897010805, 42.28486552536251, 0));

    modelCities.put("辽阳" , new ModelCity("辽阳", 123.1839680671692, 41.268987039775, 0));

    modelCities.put("白塔寺" , new ModelCity("白塔寺", 123.17659735679628, 41.27838498018665, 0));
    modelCities.put("自在州" , new ModelCity("自在州", 123.18695068359376, 41.283490586888355, 0));
    modelCities.put("东宁卫" , new ModelCity("东宁卫", 123.18675756454469, 41.272678241205334, 0));
    modelCities.put("定辽前卫" , new ModelCity("定辽前卫", 123.19740056991579, 41.263174637678986, 0));
    modelCities.put("定辽中卫" , new ModelCity("定辽中卫", 123.19346308708192, 41.26351738819636, 0));
    modelCities.put("定辽后卫" , new ModelCity("定辽后卫", 123.19008350372316, 41.2689870397753, 0));
    modelCities.put("定辽左卫" , new ModelCity("定辽左卫", 123.1839680671692, 41.2632835115677, 0));
    modelCities.put("定辽右卫" , new ModelCity("定辽右卫", 123.17763805389406, 41.268987039775, 0));
    modelCities.put("甜水站堡" , new ModelCity("☆甜水站堡，辽阳甜水镇", 123.57143998146059, 40.993186189470655, 0));
    modelCities.put("长静堡" , new ModelCity("长静堡", 122.67618834972383, 41.10473259326919, 0));
    modelCities.put("长宁堡" , new ModelCity("长宁堡", 122.73123264312746, 41.18004288658803, 0));
    modelCities.put("长定堡" , new ModelCity("长定堡", 122.79440939426424, 41.255952264366584, 0));
    modelCities.put("长安堡" , new ModelCity("长安堡，1561年修，长安堡", 122.91112303733827, 41.341879324888545, 0)); // 今灯塔县西北二台子
    modelCities.put("长胜堡" , new ModelCity("长胜堡", 122.88838863372804, 41.508239853490295, 0));
    modelCities.put("长勇堡" , new ModelCity("长勇堡", 123.08290243148805, 41.68864525182099, 0));
    modelCities.put("长营堡" , new ModelCity("长营堡", 123.1817150115967, 41.787577010901146, 0));
    modelCities.put("武靖营堡" , new ModelCity("武靖营堡", 123.2844114303589, 41.584834634400906, 0));

    modelCities.put("鞍山" , new ModelCity("鞍山", 122.85, 41.12, 0));
    modelCities.put("海城" , new ModelCity("海城", 122.75, 40.85, 0));
    modelCities.put("营口" , new ModelCity("营口", 122.18, 40.65, 0));
    modelCities.put("盖州" , new ModelCity("盖州", 122.35, 40.4, 0));
    modelCities.put("鲅鱼圈" , new ModelCity("鲅鱼圈", 122.12, 40.27, 0));
    modelCities.put("瓦房店" , new ModelCity("瓦房店", 122, 39.62, 0));
    modelCities.put("普兰店" , new ModelCity("普兰店", 121.95, 39.40, 0));

    modelCities.put("广宁" , new ModelCity("广宁", 121.7952060699463, 41.59516183953411, 0));
    modelCities.put("北镇庙" , new ModelCity("北镇庙", 121.76138877868654, 41.5964596445275, 0));
    modelCities.put("广宁卫" , new ModelCity("广宁卫", 121.80108547210695, 41.60227036170487, 0));
    modelCities.put("广宁中卫" , new ModelCity("广宁中卫", 121.79386496543886, 41.598379224778206, 0));
    modelCities.put("广宁左卫" , new ModelCity("广宁左卫", 121.80515706539155, 41.59734422308384, 0));
    modelCities.put("广宁右卫" , new ModelCity("广宁右卫", 121.7931890487671, 41.591466863867964, 0));
    modelCities.put("广宁右屯卫" , new ModelCity("广宁右屯卫", 121.51508688926698, 41.262761318485964, 0));
    modelCities.put("镇夷堡A" , new ModelCity("镇夷堡A", 121.50276482105257, 41.728842773973454, 0));
    modelCities.put("镇边堡" , new ModelCity("镇边堡", 121.77338629961015, 41.77689960221332, 0));
    modelCities.put("镇静堡" , new ModelCity("镇静堡", 121.87650918960573, 41.83213950617335, 0));
    modelCities.put("镇安堡" , new ModelCity("镇安堡", 122.00381755828859, 41.79566013760124, 0));
    modelCities.put("镇远堡" , new ModelCity("镇远堡", 122.120059132576, 41.69577951807834, 0));
    modelCities.put("镇宁堡" , new ModelCity("镇宁堡", 121.89209818840028, 41.710482182516024, 0));
    modelCities.put("镇武堡" , new ModelCity("镇武堡", 122.2057342529297, 41.3438568002625, 0));
    
    modelCities.put("北宁" , new ModelCity("北宁", 121.80138051509859, 41.5950254381121, 0));
    modelCities.put("义州" , new ModelCity("义州", 121.249760091304, 41.535956617136, 0));
    modelCities.put("义县" , new ModelCity("义县", 121.241512298584, 41.536898240577926, 0));
    modelCities.put("义州卫" , new ModelCity("义州卫", 121.25948846340181, 41.536125267298985, 0));
    modelCities.put("广宁后屯卫" , new ModelCity("广宁后屯卫", 121.24003171920778, 41.5357879669731, 0));
    modelCities.put("义州卫" , new ModelCity("义州卫", 121.25948846340181, 41.536125267298985, 0));
    modelCities.put("大定堡" , new ModelCity("大定堡", 121.12438559532166, 41.40203051016861, 0));
    modelCities.put("大安堡" , new ModelCity("大安堡", 121.07656717300415, 41.48999115849623, 0));
    modelCities.put("大康堡" , new ModelCity("大康堡", 121.08164727687837, 41.53915888343526, 0));
    modelCities.put("大平堡" , new ModelCity("大平堡", 121.14981293678285, 41.61585139861677, 0));
    modelCities.put("大宁堡" , new ModelCity("大宁堡", 121.25331401824953, 41.6465646351942, 0));
    modelCities.put("大靖堡" , new ModelCity("大靖堡", 121.32161378860475, 41.70421463670417, 0));
    modelCities.put("大清堡" , new ModelCity("大清堡", 121.42632722854616, 41.72579805346487, 0));

    modelCities.put("锦州" , new ModelCity("锦州", 121.14121913909914, 41.12518262499779, 0));
    modelCities.put("锦州城" , new ModelCity("锦州城", 121.14121913909914, 41.12518262499779, 0));
    modelCities.put("大兴堡" , new ModelCity("大兴堡", 120.94953775405884, 40.967536884767746, 0));
    modelCities.put("大福堡" , new ModelCity("大福堡", 120.94571828842165, 41.035947931616626, 0));
    modelCities.put("大镇堡" , new ModelCity("大镇堡", 121.04862928390504, 41.125408913815924, 0));
    modelCities.put("大胜堡" , new ModelCity("大胜堡", 121.04257822036745, 41.21967508648197, 0));
    modelCities.put("大茂堡" , new ModelCity("大茂堡", 121.12395644187929, 41.27695582251622, 0));
    modelCities.put("广宁中屯卫" , new ModelCity("广宁中屯卫", 121.15678668022157, 41.12433807591069, 0));
    modelCities.put("广宁左屯卫" , new ModelCity("广宁左屯卫", 121.13058149814607, 41.14217232002054, 0));
    modelCities.put("宁远" , new ModelCity("宁远", 120.71284890174867, 40.62255644242793, 0));
    modelCities.put("兴城" , new ModelCity("兴城", 120.71284890174867, 40.62255644242793, 0));
    modelCities.put("首山" , new ModelCity("首山", 120.75987339019777, 40.63885336486268, 0));
    modelCities.put("中左所" , new ModelCity("中左所", 120.94485998153688, 40.84844816300846, 0));
    modelCities.put("松山寺堡" , new ModelCity("松山寺堡", 120.74515342712404, 40.79846068213343, 0));
    modelCities.put("沙河儿堡" , new ModelCity("沙河儿堡", 120.77131032943727, 40.82958651687214, 0));
    modelCities.put("长岭山堡" , new ModelCity("长岭山堡", 120.83137035369874, 40.85798753457362, 0));
    modelCities.put("椴木冲堡" , new ModelCity("椴木冲堡", 120.85217356681824, 40.91558002541905, 0));
    modelCities.put("宁远卫" , new ModelCity("宁远卫", 120.71498125791553, 40.62329137554418, 0));
    modelCities.put("兴水县堡" , new ModelCity("兴水县堡", 120.59392511844636, 40.655506476087034, 0));
    modelCities.put("白塔峪堡" , new ModelCity("白塔峪堡", 120.6268358230591, 40.71360410793847, 0));
    modelCities.put("寨儿山堡" , new ModelCity("寨儿山堡", 120.66794872283937, 40.7173549968734, 0));
    modelCities.put("灰山堡" , new ModelCity("灰山堡", 120.73680639266969, 40.74466404012713, 0));
    modelCities.put("中右所" , new ModelCity("中右所", 120.57755827903749, 40.47813721108605, 0));
    modelCities.put("黑庄窠堡" , new ModelCity("黑庄窠堡", 120.44994413852693, 40.455517427170745, 0));
    modelCities.put("仙灵寺堡" , new ModelCity("仙灵寺堡", 120.50762772560121, 40.48745634524625, 0));
    modelCities.put("小团山堡" , new ModelCity("小团山堡", 120.53942799568178, 40.56264749322676, 0));
    modelCities.put("广宁前屯卫" , new ModelCity("广宁前屯卫", 120.10287165641786, 40.18874611765991, 0));
    modelCities.put("三山营堡" , new ModelCity("三山营堡", 120.01677811145784, 40.23642188670281, 0)); // 葫芦岛市绥中县三山营村
    modelCities.put("平川营堡" , new ModelCity("平川营堡", 120.10454535484315, 40.282050701155065, 0)); // 葫芦岛市绥中县平川营村
    modelCities.put("瑞昌堡" , new ModelCity("瑞昌堡", 120.15003561973572, 40.318213379912265, 0));
    modelCities.put("高台营堡" , new ModelCity("高台营堡", 120.2388918399811, 40.383240253231, 0)); // 高台堡
    modelCities.put("镇远关" , new ModelCity("镇远关", 121.87650918960573, 41.83204757421978, 0)); // 白土厂关 锦州市黑山县白厂门镇

    modelCities.put("牛彦章堡" , new ModelCity("牛彦章堡", 120.26166915893556, 40.441745932184965, 0));
    modelCities.put("毛剌关" , new ModelCity("毛剌关", 120.26166915893556, 40.441745932184965, 0)); // 葫芦岛市绥中县上顺山堡
    modelCities.put("白石嘴门" , new ModelCity("白石嘴门", 120.12094974517824, 40.61429450496074, 0)); // 葫芦岛市兴城市西门村
    modelCities.put("吾名口" , new ModelCity("吾名口", 119.69763815402986, 40.21729702714694, 0));
    modelCities.put("九门口" , new ModelCity("九门口，一片石关", 119.75138425827028, 40.117329579740534, 0));
    modelCities.put("角山长城" , new ModelCity("角山长城", 119.74172830581666, 40.0370943970015, 0));
    modelCities.put("天下第一关" , new ModelCity("天下第一关", 119.76232230663301, 40.00971886143317, 0));
    modelCities.put("老龙头" , new ModelCity("老龙头", 119.80136990547182, 39.967795232656954, 0));

    modelCities.put("中前所" , new ModelCity("中前所", 119.96415853500368, 40.10448812818715, 0));
    modelCities.put("铁场堡" , new ModelCity("铁场堡", 119.81059134006502, 40.152227199868776, 0)); // 葫芦岛市绥中县铁厂堡村
    modelCities.put("永安堡" , new ModelCity("永安堡", 119.81231331825258, 40.23372724458394, 0));
    modelCities.put("▼背阴障堡" , new ModelCity("▼背阴障堡", 119.93700921535492, 40.24581134417713, 0));
    modelCities.put("中后所" , new ModelCity("中后所", 120.34546136856079, 40.32555892306715, 0));
    modelCities.put("三道沟堡" , new ModelCity("三道沟堡", 120.19111633300783, 40.6269944196581, 0));
    modelCities.put("新兴营堡" , new ModelCity("新兴营堡", 120.26520431041719, 40.44565498035356, 0)); // 牛彦章村
    modelCities.put("锦川营堡" , new ModelCity("锦川营堡", 120.34275233745576, 40.429974548157226, 0));

    modelCities.put("开原" , new ModelCity("开原", 124.03, 42.53, 0));
    modelCities.put("开原城" , new ModelCity("开原城", 124.08318534493448, 42.60327390469108, 0));
    modelCities.put("三万卫" , new ModelCity("三万卫", 124.09439563751222, 42.608430958448494, 0));
    modelCities.put("辽海卫" , new ModelCity("辽海卫", 124.08620953559877, 42.60321911888262, 0));
    modelCities.put("安乐州" , new ModelCity("安乐州", 124.0821808576584, 42.604093711800324, 0));
    modelCities.put("庆云堡" , new ModelCity("庆云堡", 123.85975599288942, 42.55357820175393, 0));
    modelCities.put("古城堡" , new ModelCity("古城堡", 123.87801647186281, 42.629159496723865, 0));
    /* 今辽宁昌图县西南。今昌图县附近今昌图永安堡  永宁堡：即今昌图亮中桥镇茨榆城子，此城堡南有一门。 */
    //   永宁堡：即今昌图亮中桥镇茨榆城子，此城堡南有一门。
    /* http://blog.sina.com.cn/s/blog_891d71450102w768.html */
    modelCities.put("▼永宁堡" , new ModelCity("▼永宁堡", 123.88526916503908, 42.717128542896724, 0));
    modelCities.put("镇夷堡B" , new ModelCity("镇夷堡B", 124.1173553466797, 42.779133615413734, 0));
    modelCities.put("清阳堡" , new ModelCity("清阳堡", 124.13868963718416, 42.78964646059465, 0));
    modelCities.put("镇北堡" , new ModelCity("镇北堡", 124.278062582016, 42.785962591175576, 0));
    modelCities.put("威远堡" , new ModelCity("威远堡", 124.25598800182344, 42.674011502487744, 0));
    modelCities.put("靖安堡" , new ModelCity("靖安堡", 124.20129776000978, 42.54691532526677, 0));
    modelCities.put("松山堡" , new ModelCity("松山堡", 124.17467415332796, 42.39832194416782, 0));

    modelCities.put("牛庄" , new ModelCity("牛庄", 122.53692269325258, 40.94833843654967, 40));
    modelCities.put("海州卫" , new ModelCity("海州卫", 122.75302290916443, 40.85380839580064, 40));
    modelCities.put("西兴堡" , new ModelCity("西兴堡", 122.22872078418733, 41.37045424834136, 40));
    modelCities.put("西平堡" , new ModelCity("西平堡", 122.37930536270143, 41.15357577508942, 40));
    modelCities.put("西宁堡" , new ModelCity("西宁堡", 122.40433573722841, 41.02393114288326, 40)); // 盘锦市盘山县古城子村 三岔关
    modelCities.put("东昌堡" , new ModelCity("东昌堡", 122.03185200691225, 41.090482511922396, 40));
    modelCities.put("东胜堡" , new ModelCity("东胜堡", 122.64301478862764, 41.05650027561139, 40));
    modelCities.put("归州堡" , new ModelCity("归州堡", 121.99616789817811, 40.0998761015431954, 40));

    modelCities.put("盖州卫" , new ModelCity("盖州卫", 122.36573338508607, 40.40071477743449, 40));
    modelCities.put("熊岳驿堡" , new ModelCity("熊岳驿堡", 122.1478843688965, 40.18056191556154, 40));
    modelCities.put("▼五十寨堡" , new ModelCity("▼五十寨堡", 121.9376420974731, 39.97867394777227, 40));
    modelCities.put("▼伏兵堡" , new ModelCity("▼伏兵堡", 121.89036011695862, 39.92049973115853, 40));
    modelCities.put("复州卫" , new ModelCity("复州卫", 121.71422481536867, 39.732146067016636, 40));
    modelCities.put("杨官寨堡" , new ModelCity("杨官寨堡", 121.57449245452882, 39.67027772175961, 40));
    modelCities.put("栾古驿堡" , new ModelCity("栾古驿堡", 121.88133716583253, 39.52062814277627, 40));

    modelCities.put("大黑山" , new ModelCity("大黑山", 121.78434848785402, 39.09103344557164, 40));
    modelCities.put("金州卫" , new ModelCity("金州卫", 121.72078013420106, 39.10610706858463, 40));
    modelCities.put("旅顺口城" , new ModelCity("旅顺口城", 121.2620258331299, 38.85167344209855, 40));
    modelCities.put("▼木场驿" , new ModelCity("▼木场驿", 121.43756568431854, 38.995852636506626, 40));
    modelCities.put("望海埚堡" , new ModelCity("望海埚堡", 121.96232914924623, 39.22222588688922, 40));
    modelCities.put("红嘴堡" , new ModelCity("红嘴堡", 122.3465394973755, 39.40027122929819, 40));
    modelCities.put("▼归服堡" , new ModelCity("▼归服堡", 122.49673247337343, 39.51519875903236, 40));
    modelCities.put("黄骨岛堡" , new ModelCity("黄骨岛堡", 123.25046539306642, 39.746398049658005, 0));
    /* 明代“宣城城址”位于东港市新城管理区北5华里宣城村的宣城山上。 */
    modelCities.put("宣城卫" , new ModelCity("宣城卫，1414年", 124.08528685569765, 39.92280773779301, 0));

    modelCities.put("大连" , new ModelCity("大连", 121.62, 38.92, 40));
    modelCities.put("丹东" , new ModelCity("丹东", 124.37, 40.13, 76));
    modelCities.put("抚顺" , new ModelCity("抚顺", 123.97, 41.97, 253));
    /* 大安四年（1088年）八月日建 */
    modelCities.put("辽代古塔" , new ModelCity("辽代古塔", 123.90665978193285, 41.890573993329966, 0));
    /* 1630年 */
    modelCities.put("清代观音阁" , new ModelCity("清代观音阁", 123.90681535005571, 41.89001441744098, 0));
    /* 明代抚顺城位于浑河北岸高尔山下，现已无存，大体位置在今抚顺北火车站西边不远之处。 */
    modelCities.put("抚顺城" , new ModelCity("抚顺城", 123.91169160604478, 41.889953517717494, 0));
    /* 抚顺关位于辽宁省抚顺市东10公里的前甸乡关岭村附近，关隘设在浑河河谷要冲之北的制高点上。 */
    modelCities.put("抚顺关" , new ModelCity("抚顺关", 124.04647529125215, 41.90483029336027, 76));
    modelCities.put("王杲山" , new ModelCity("王杲山", 124.11038160324098, 41.863362747971706, 0));
    modelCities.put("萨尔浒" , new ModelCity("萨尔浒", 124.12327766418458, 41.86033240170541, 76));
    modelCities.put("马根单堡" , new ModelCity("◇马根单堡，1469年，抚顺马郡村", 124.06755208969118, 41.65518256103805, 76));
    /* http://book.people.com.cn/GB/69399/71392/71506/4848557.html# */
    /* 东州堡（今抚顺东洲区大东洲村） */
    /* https://www.weibo.com/p/230418a6d4ae870102vlj9 */
    /* 东州堡：位于抚顺县小东乡大东州村。 */
    /*
     * 《辽东志》卷七“韩斌辽东防守规划”中记载：“戊子（1468年）斌任副总兵，献防守规划为堡守之。
     * 自抚顺而南四十里设东洲堡，东洲堡之南三十里设马根丹堡，
     * 马根丹堡之南九十里设清河堡，清河堡之南七十里设碱场堡，
     * 碱场堡之南一百二十里设叆阳堡，烽堠相望，远近应援，拓地千里。”
     */
    /* 东州堡，(今辽宁抚顺县东大东州)抚顺市抚顺县大东村 */
    modelCities.put("东州堡" , new ModelCity("◇东州堡，1469年，抚顺市抚顺县救兵镇大东村", 124.01464819908144, 41.7436959778904, 0));
    modelCities.put("东洲村" , new ModelCity("东洲村", 124.05229171964508, 41.85634512373739, 0)); // 抚顺市东洲区碾盘乡东洲村
    modelCities.put("大东村" , new ModelCity("大东村", 124.01779174804689, 41.74646968972222, 0)); // 抚顺市抚顺县大东村
    modelCities.put("小东村" , new ModelCity("小东村", 124.00440216064455, 41.72789594340987, 0)); // 抚顺市抚顺县小东村
    modelCities.put("会安堡" , new ModelCity("会安堡", 123.87343525886537, 41.97712336523488, 76));
    modelCities.put("▼散羊峪堡" , new ModelCity("◇散羊峪堡，1546年张铎增设，抚顺救兵镇山龙村", 124.11391139030458, 41.56926046099238, 76));
    modelCities.put("清河堡" , new ModelCity("◆清河堡，1469年", 124.23110246658327, 41.45635702652668, 0));
    modelCities.put("▼一堵墙堡" , new ModelCity("◇一堵墙堡，1546年张铎增设，本溪南甸镇马家城子（水没）", 124.33167457580568, 41.36131719400355, 76));
    modelCities.put("硷场堡" , new ModelCity("◇硷场堡，1469年，本溪碱厂镇", 124.47886347770692, 41.25242345544687, 0));
    modelCities.put("▼孤山堡" , new ModelCity("◇孤山堡，1546年张铎增设，本溪东营房乡孤山村", 124.41941499710084, 41.1299668509868, 76));
    // https://mp.weixin.qq.com/s/gXkOwdTK72sCoMWJqjXEdg
    modelCities.put("■张其哈剌佃子" , new ModelCity("□张其哈剌佃子，本溪湖里村", 124.54496383666994, 41.17710352162802, 0)); // 本溪市本溪满族自治县湖里村/新开岭屯
    modelCities.put("■孤山新堡" , new ModelCity("◇孤山新堡，1576年，本溪东营房乡新城子村", 124.48921144008638, 41.12314801102135, 0)); // 本溪市本溪满族自治县东营房乡新城子村
    modelCities.put("连山关" , new ModelCity("连山关", 123.75802299999998, 40.96959, 76));
    modelCities.put("P点" , new ModelCity("P点", 124.699594, 40.330009, 0)); // ★
    modelCities.put("Q点" , new ModelCity("Q点", 124.695309, 40.322623, 0));
    modelCities.put("古楼子村" , new ModelCity("古楼子村", 124.672272, 40.318582, 0));
    modelCities.put("大蒲石河村" , new ModelCity("大蒲石河村", 124.693677, 40.334060, 0));
    modelCities.put("古楼子乡" , new ModelCity("古楼子乡", 124.6576507, 40.315684, 0));
    modelCities.put("丹东" , new ModelCity("丹东", 124.387597, 40.123787, 0));
    // 汉马城城址 位于凤城市青城子镇皇宫社区青城子铅矿医院东侧。
    modelCities.put("汉马城城址" , new ModelCity("汉马城城址", 123.62228393554689, 40.73412061435751, 0));
    // 今辽宁凤城市西北青城子镇丹东市凤城市青城子镇。
    modelCities.put("青苔峪堡" , new ModelCity("☆青苔峪堡，1481年，凤城市青城子镇", 123.6131000518799, 40.73611236868039, 0));
    modelCities.put("通远堡" , new ModelCity("通远堡", 123.927051, 40.786887, 0));
    modelCities.put("镇夷堡" , new ModelCity("☆镇夷堡，1481年，凤城市通远堡", 123.92539501190187, 40.79632053642111, 0));
    // 位于凤城市通远堡镇老堡村北侧砖城里耕地中。
    modelCities.put("老堡城址" , new ModelCity("老堡城址，1481年，凤城市通远堡", 123.92412900924684, 40.81623097218759, 0));
    // 薛礼站城址 位于凤城市鸡冠山镇薛礼村中心街东部薛礼火车站附近。
    modelCities.put("镇东堡" , new ModelCity("☆镇东堡，1469年，凤城市鸡冠山镇薛礼村", 123.98185282945634, 40.58280100930842, 0));
    modelCities.put("凤城" , new ModelCity("凤城", 124.05, 40.47, 0));
    modelCities.put("凤凰城堡" , new ModelCity("☆凤凰城堡，1469年，1480年", 124.06868934631349, 40.42949678978668, 0));
    modelCities.put("汤站堡" , new ModelCity("☆汤站堡，1480年，凤城市汤山城镇", 124.21007394790651, 40.31161152508283, 0)); // 凤城市汤山城镇
    modelCities.put("新安堡" , new ModelCity("☆新安堡，1509年，凤城市石城镇", 124.31449234485626, 40.63998703973425, 0)); // 凤城市石城镇
    modelCities.put("草河堡" , new ModelCity("草河堡，1469年", 124.04340147972108, 40.88946055383368, 0));
    /* http://blog.sina.com.cn/s/blog_4851960f0100uvkr.html */
    /* 明代辽东副总兵韩斌，他曾在明成化年间镇守辽东，修筑辽东东部边墙。
     * 成化五年他开始修筑叆阳城，成化七年峻工，曾立碑以纪之。
     * 上有“钦差镇守辽东”字样。此碑现在灌水镇柏林川村。 
     */
    modelCities.put("镇朔关" , new ModelCity("镇朔关，1471年韩斌", 124.52367782592775, 40.88469127861962, 0)); // 凤城市叆阳城
    /* 在爱阳镇爱阳城村北1．5公里疆河南岸明代边墙镇朔关遗址处。*/
    /* 在村中的关帝庙，记者看到一块石制匾额，上刻“叆阳城，成化柒年八月中秋日立”，应是叆阳城门匾。 */
    modelCities.put("靉阳堡" , new ModelCity("☆靉阳堡，1471年韩斌，凤城市叆阳镇叆阳城村", 124.51982617378236, 40.90177148128095, 0)); // 凤城市叆阳城
    modelCities.put("柏林川村" , new ModelCity("柏林川村，成化碑", 124.53520059585573, 40.89540138949954, 0));
    modelCities.put("小边沟" , new ModelCity("小边沟", 124.55831050872804, 40.903571701570264, 0));
    /* 位于灌水镇二台子村五组，西侧为灌水—柏林川的公路(小林线)。 */
    modelCities.put("二台子烽火台" , new ModelCity("二台子烽火台", 124.554340839386, 40.92907766380368, 0));
    /* 位于灌水镇三台子村，西侧100米为小林线公路。 */
    modelCities.put("三台子烽火台" , new ModelCity("三台子烽火台", 124.5729446411133, 40.96194685994131, 0));
    /*  位于宽甸满族自治县灌水镇龙爪沟村过(果)门岭组长岭西。 */
    modelCities.put("长岭烽火台" , new ModelCity("长岭墩，长岭烽火台", 124.6681308746338, 40.7996139768298, 0));
    /* 位于宽甸满族自治县灌水镇三台子村委会北20米处的山峰主峰上。 */
    modelCities.put("三台子小楼烽火台" , new ModelCity("三台子小楼烽火台", 124.61332798004152, 40.99382795224264, 0));
    /* 位于宽甸满族自治县灌水镇天华村东山的山顶上。 */
    modelCities.put("东山烽火台" , new ModelCity("东山烽火台", 124.57818031311037, 41.01606107242147, 0));
    /*位于宽甸满族自治县灌水镇团结村二头山的顶峰上。 */
    modelCities.put("二头山烽火台" , new ModelCity("二头山烽火台", 124.54307556152345, 40.82199367154931, 0));
    /* 位于宽甸满族自治县青椅山镇三道沟村五组北2000米的大古山主峰上。 */
    modelCities.put("大古山烽火台" , new ModelCity("大古山烽火台", 124.57041263580324, 40.69382966971865, 0));
    // 位于凤城市爱阳镇太河村吴家堡北200米平地（土城地）。
    modelCities.put("吴家堡土城址" , new ModelCity("吴家堡土城址", 124.50767040252687, 40.890413556568475, 0));
    // 位于凤城市赛马镇北岔路村前堡子西北60米山坡耕地中。
    modelCities.put("前屯城址" , new ModelCity("前屯城址", 124.20376539230348, 40.914590900883674, 0));
    /* 210682353102170007 赛马城城址 位于凤城市赛马镇赛马村城里居民组堡中。 */
    modelCities.put("洒马吉堡" , new ModelCity("☆洒马吉堡，凤城市赛马镇", 124.25448060035707, 40.979015204655255, 0)); // 凤城市赛马镇
    /* https://www.weibo.com/ttarticle/p/show?id=2309404170382109219308 */
    /* 险山堡位于凤城市东汤镇民生村河西村民组民生村小学西侧，距离东汤镇前往石城镇的公路张关线20米，非常容易寻找。民生村距离丹东市区大约48公里，一小时四十分钟的车程；民生村距离东汤镇7.5公里，二十五分钟的车程。*/
    /* 大明于1480年（明成化十六年）起，建汤站、凤凰等堡，派驻军队戍边。继于1546年（明嘉靖二十五年），在边远要道建孤山、险山等6堡。其中险山堡就是辽东诸堡中的首堡，具有军事大本营的作用。 */
    /* 210682353102170003 汤半城 位于东汤镇民生村河西村民组北侧平地上。 */
    /* http://tv.cctv.com/2015/09/29/VIDE1443522362552636.shtml */
    modelCities.put("险山台" , new ModelCity("险山台", 124.3455657362938, 40.45406733820548, 0)); // 东汤镇民生村
    modelCities.put("▼险山堡" , new ModelCity("★险山堡，1546年张铎增设，凤城市东汤镇民生村，3074名官军", 124.3455657362938, 40.45406733820548, 0)); // 东汤镇民生村
    /* http://tv.cctv.com/2015/09/29/VIDE1443522361526554.shtml */
    /* 北山有明万历二十八年重修险山堡朝阳寺碑 */
    modelCities.put("朝阳寺" , new ModelCity("朝阳寺", 124.34965610504152, 40.45519087925425, 0)); // 东汤镇民生村
    /* https://www.weibo.com/ttarticle/p/show?id=2309404113557393383926 */
    /* http://www.xzwyu.com/renwen/138802.html */
    /* http://www.xzwyu.com/renwen/138802_2.html */
    /* http://tv.cctv.com/2015/09/29/VIDE1443522363940724.shtml */
    /* 210682353102170002  土城子堡 位于东汤镇土城子村围子里村民组东南侧平地上，南距叆河支流200米。*/
    modelCities.put("宁东堡" , new ModelCity("☆宁东堡，1546年，凤城市土城子村，1960年大洪水损毁。", 124.39555406570436, 40.361931298271564, 0)); // 凤城市土城子村
    /* 210682353102170001 小城子堡 丹东市凤城东汤乡小城子村 */
    modelCities.put("媳妇山堡" , new ModelCity("媳妇山废堡", 124.37444508075716, 40.355246851482846, 0)); // 凤城市土城子村
    modelCities.put("江沿台" , new ModelCity("江沿台", 124.4579315185547, 40.29005078858388, 76)); // 振安区东城村(水没)
    /* http://tv.cctv.com/2015/09/29/VIDE1443522361839578.shtml */
    modelCities.put("江沿台堡" , new ModelCity("☆江沿台堡，1546年初建张铎增设1565年再建，振安区楼房镇东城村(水没)", 124.4579315185547, 40.29005078858388, 76)); // 振安区东城村(水没)

    /*
     * 宽甸堡（今宽甸县所在地）、
     * 大甸子堡（今宽甸县坦甸子大队所在地）、
     * 永甸堡（今宽甸县永甸公社所在地）、
     * 长甸堡（今宽甸县永甸公社长甸子大队），
     * 再转向南至长佃河口沿海防御营城苏甸子城止
     */
    modelCities.put("■新奠堡" , new ModelCity("长岭■新奠堡，1576年建成，赫甸，城为方形，每边长237米。", 124.64341163635255, 40.74339599097626, 0)); // 今宽甸县青椅山公社赫甸城大队
    modelCities.put("石岔口" , new ModelCity("石岔口", 124.78250563144685, 40.725776954636316, 0)); // 今宽甸县？？
    modelCities.put("宽佃子" , new ModelCity("宽佃子", 124.78250563144685, 40.725776954636316, 0)); // 今宽甸县
    modelCities.put("■宽奠堡" , new ModelCity("宽佃子■宽奠堡，宽甸，东西墙长900米，南北墙长1100米。", 124.78250563144685, 40.725776954636316, 0)); // 今宽甸县
    modelCities.put("松子岭" , new ModelCity("松子岭", 124.80827137982881, 40.858477857481795, 0)); // 今宽甸满族自治县大川头乡松树岭
    modelCities.put("干滩子" , new ModelCity("干滩子", 124.81836073201102, 41.02937860358624, 0)); // 今宽甸八河川，清时称八河滩，明时称干滩子；
    modelCities.put("■大奠子堡" , new ModelCity("散等■大奠堡，1576年建成，坦甸，南北墙长350米，东西墙长275米。", 124.79889392852785, 40.62161791497431, 0));
    modelCities.put("■永奠堡" , new ModelCity("双墩儿■永奠堡，1577年建成，永甸，东西墙长380米，南北墙长400米。", 124.83223378658296, 40.55557643314853, 0));
    modelCities.put("■长奠堡" , new ModelCity("长佃子■长奠堡，1575年建成，长甸，北墙残长300米，东墙长约400米。", 124.81586694717409, 40.484294349736444, 0));
    modelCities.put("■苏佃子城" , new ModelCity("◎苏佃子城，1577年建成，苏甸，南北长约250米，东西长约300米。", 124.78784322738649, 40.43115872093923, 0));
    /* 210624353102170002 杨木川土城子堡 位于宽甸县杨木川乡土城子村南500米处,东北2米为土城子小学。 */
    modelCities.put("■大奠堡" , new ModelCity("■大佃子堡，1576年建成，杨木川土城子村，444名官军，城址平面呈方形，边长约300米。", 124.61538791656496, 40.545634930725775, 0)); // 丹东市宽甸满族自治县土城子村，宽甸县杨木川乡土城子村南500米处,东北2米为土城子小学。
    modelCities.put("■镇江堡" , new ModelCity("◎镇江堡，1569年重建，九连城", 124.46860671043397, 40.20268198778386, 0));
    modelCities.put("南荒沟烽火台" , new ModelCity("南荒沟烽火台", 124.60684776306154, 40.282635905886295, 0));
    modelCities.put("炮台山烽火台" , new ModelCity("炮台山烽火台", 124.66540038585664, 40.32140977099779, 0));
    modelCities.put("钟鼓楼" , new ModelCity("钟鼓楼", 124.67250287532808, 40.31791581949183, 0));
    modelCities.put("虎山长城" , new ModelCity("邦山台，虎山长城", 124.52214494347574, 40.22502933036544, 0));
    modelCities.put("拉古哨" , new ModelCity("拉古哨", 124.9411692190952, 40.45917190118727, 0));
    modelCities.put("鸦鹘关" , new ModelCity("鸦鹘关，1468年建成韩斌，新宾苇子峪镇三道关村", 124.57224726676942, 41.5420076627404, 0)); // 抚顺市新宾满族自治县三道关村
    modelCities.put("新鸦鹘关" , new ModelCity("新鸦鹘关，新宾马圈子乡金斗峪村", 124.36982631683351, 41.48259700487439, 0)); // 新鸦鹘关位于抚顺新宾满族自治县马圈子乡金斗峪村。 万历末年，放弃鸦鹘关之后，总兵李成梁又在旧关西南五十里，重建新关，仍名鸦鹘关，并在新鸦鹘关附近重修一条长城，以作为清河堡边防的屏障。
    modelCities.put("古勒城" , new ModelCity("古勒城，新宾上夹河镇古楼村", 124.3772077560425, 41.87658312557577, 0)); // 今辽宁省新宾满族自治县上夹河镇古楼村
    modelCities.put("扎喀关" , new ModelCity("扎喀关", 124.3772077560425, 41.87658312557577, 0));
    modelCities.put("玳珉关" , new ModelCity("玳珉关", 124.5897674560547, 41.8118833076401, 0)); // 抚顺市新宾满族自治县马尔墩岭
    modelCities.put("雅尔哈关" , new ModelCity("雅尔哈关", 124.537410736084, 41.86559796079286, 0)); // 今新宾上夹河镇五龙村西南处，现留有关墙近千米是建州三关之一。
    modelCities.put("札喀关" , new ModelCity("札喀关", 124.59577560424806, 41.80151886731471, 0)); // 今新宾木奇镇三道关村抚顺市新宾满族自治县西三道关
    modelCities.put("扎喀尖" , new ModelCity("扎喀尖", 124.5324754714966, 41.86077188073308, 0)); // 今辽宁省新宾县上夹河镇五龙村西南山上
    modelCities.put("建州老寨" , new ModelCity("建州老寨", 124.86577749252321, 41.70461513713827, 0)); // 抚顺市新宾满族自治县赫图阿拉城
    modelCities.put("章甲城" , new ModelCity("章甲城", 124.91280734539033, 41.739549195325644, 0)); // 抚顺市新宾满族自治县永陵镇珠子山距网户村东北的北砬背山很近珠子山下现有一村屯曰西石场，北邻网户村，山西北坡有一砖瓦厂，村北是老砬背山，南距苏子河约250米，章京河就是由城东的陡崖下流入苏子河，城西南距赫图阿拉城约3.5公里。山上是一座平面方形的小山寨，东、北、南三面陡峭，难以攀缘，惟西面是东西走向的漫岗，有利于行走运输。城内，东西残存约50米，南北宽30米，东北角是城门，沿城门向西，地势渐低，因而修了一条长20米，宽2米的门道，通向山下。由于珠子山早已被当地百姓开垦，只能分辨出上述一些痕迹，不过，遗憾中也有令人难忘的，那就是城外至城内尚存一条引水渠。
    modelCities.put("牛毛寨" , new ModelCity("牛毛寨", 125.17060518264772, 41.322250331342595, 0)); // 本溪市桓仁县大甸子村
    modelCities.put("董古寨" , new ModelCity("董古寨", 124.94829297065736, 41.22458758080949, 0)); // 此寨疑即栋鄂城，即本溪市桓仁满族自治县韭菜园村
    modelCities.put("小雅河村" , new ModelCity("小雅河村", 124.9329560995102, 41.11259408056858, 0)); // 丹东市宽甸满族自治县八河川镇小雅河村
    // modelCities.put("董古寨" , new ModelCity("董古寨", 124.94829297065736, 41.22458758080949, 0)); // 此寨疑即栋鄂城，即本溪市桓仁满族自治县韭菜园村
    modelCities.put("夹道子村" , new ModelCity("夹道子村", 124.94929343461993, 41.128442522928694, 0)); // 桓仁县普乐堡镇的夹道子村

    modelCities.put("姜家堡土城址" , new ModelCity("姜家堡土城址", 125.19904196262361, 40.99829380029085, 0)); // 位于宽甸满族自治县青山沟镇青山沟村东南150米的田地里。
    /* http://wlg.dandong.gov.cn/m/wwycnews.asp?id=46 明长城-双岭子土城址位于辽宁省丹东市宽甸满族自治县石湖沟乡双岭子村2组与3组交界处的玉米地中。城址大致为正方形，边长100米。现墙体存高0-0.4米左右，残长20余米的一道土棱。而且土墙内侧与地面相连，已无法了解原来的结构。*/
    modelCities.put("双岭子土城址" , new ModelCity("双岭子土城址，城址大致为正方形，边长100米。", 124.73040103912355, 40.68713044670614, 0)); // 宽甸县石湖沟乡双岭子村2组与3组交界处的玉米地中
    /* 明长城-蒲石河土城址位于辽宁省丹东市宽甸满族自治县长甸镇桦树甸子村孟家堡子村民组南200米处。原城墙已损毁，现在只保留东墙南侧一段东西长30米、坍塌后南北宽10米、存高40-80厘米的墙体。 */
    modelCities.put("蒲石河土城址" , new ModelCity("蒲石河土城址，东西长30米、坍塌后南北宽10米", 124.68889117240907, 40.48794593123251, 0)); // 位于宽甸县长甸镇桦树甸子村孟家堡子村民组南200米处。
    /* 明长城-六道河土城址位于辽宁省丹东市宽甸满族自治县青椅山镇八棵树村六道河南岸的台地上。城址平面为长方形,东西长80米,南北宽70米,周长300米.城内地势北低南高,北面现为六道河小学和民居,南面丘陵漫岗则是耕地.城址保存较差，墙体已坍塌，现在仅能看出几段基宽2米,顶宽1米,存高0-1.1米的土棱。北墙、南墙均设有一门,现已改为村级公路的出路口，无法看出原格局。城址的四周原来建有角楼,现在荡然无存.据调查了解，城外四周原有护城壕,剖面呈倒梯形,底宽1米,顶宽2米,深浅不等。现在东墙外流淌的小溪就属于当年的一段护城壕沟，其它段壕沟已经无存。 */
    /* http://wlg.dandong.gov.cn/m/wwycnews.asp?id=48 */
    modelCities.put("六道河城址" , new ModelCity("六道河城址，东西长80米,南北宽70米", 124.58598017692567, 40.7368440185582, 0)); // 位于宽甸县青椅山镇八棵树村六道河南岸的台地上。
    modelCities.put("城东山烽火台" , new ModelCity("城东山烽火台", 124.48840141296388, 40.478822725631844, 0)); // 位于宽甸满族自治县杨木川镇边沟村13组201国道东侧的城东山主峰上。
    modelCities.put("生铁顶子烽火台" , new ModelCity("生铁顶子烽火台", 124.51715469360353, 40.514680061255326, 0)); // 位于宽甸满族自治县杨木川镇大榆树村8组生铁顶子山主峰上。
    /* 210624353102170001  安平城 位于杨木川乡边沟村13组，南距201国道200米。*/
    modelCities.put("安平城" , new ModelCity("安平城", 124.47209358215333, 40.47280383208482, 0)); // 杨木川乡边沟村13组，南距201国道200米。
    modelCities.put("向阳西山烽火台" , new ModelCity("向阳西山烽火台", 124.65313732624055, 40.43787748580742, 0)); // 宽甸满族自治县长甸镇小孤山村西山的主峰上。
    modelCities.put("长甸东山烽火台" , new ModelCity("长甸东山烽火台", 124.839706, 40.480577, 0)); // 位于长甸镇长甸村东1500米处的山峰上，当地人称“榛柴山”。
    modelCities.put("台沟烽火台" , new ModelCity("台沟烽火台", 124.86486554145814, 40.499129958231016, 0)); // 长甸镇台沟村西200米山脊上。
    modelCities.put("前进烽火台" , new ModelCity("前进烽火台", 124.91351008415222, 40.50314172003898, 0)); // 位于长甸镇前进村孙家堡子西南500米山峰上。
    modelCities.put("尖头山烽火台" , new ModelCity("尖头山烽火台", 124.91261959075929, 40.56185687575818, 0)); // 位于宽甸满族自治县永甸镇碑沟村2组尖头山主峰上。
    modelCities.put("老殷大尧沟山烽火台" , new ModelCity("老殷大尧沟山烽火台", 125.23362636566164, 40.66019659987496, 0)); // 位于宽甸满族自治县大西岔镇沿江村3组老殷大尧沟山主峰上。
    modelCities.put("老黄前沟东山烽火台" , new ModelCity("老黄前沟东山烽火台", 125.23371219635011, 40.67174449678953, 0)); // 位于宽甸满族自治县大西岔镇沿江村三组老黄前沟东山海拔625米的主峰上。
    modelCities.put("老付家前山烽火台" , new ModelCity("老付家前山烽火台", 125.23774623870851, 40.66299627364684, 0)); // 位于宽甸满族自治县大西岔镇沿江村3组南800米老付家前山的主峰上。
    modelCities.put("白菜地南山烽火台" , new ModelCity("白菜地南山烽火台", 125.23240327835084, 40.65690032171277, 0)); // 位于宽甸满族自治县大西岔镇沿江村3组白菜地南山海拔356米的主峰上。
    modelCities.put("贾家堡子烽火台" , new ModelCity("贾家堡子烽火台", 124.38287258148195, 40.61328459728328, 0)); //   位于宽甸满族自治县毛甸子镇丰裕村东南200米的台地上。
    modelCities.put("亮马佃" , new ModelCity("亮马佃", 125.16517639160158, 40.87263678242497, 0)); //  丹东市宽甸满族自治县太平哨镇
    modelCities.put("小孤山烽火台" , new ModelCity("小孤山墩，小孤山烽火台", 124.6831512451172, 40.94091116236985, 0)); // 位于宽甸满族自治县双山子镇双山子村碑沟组西300米的小孤山上。
    modelCities.put("老古沟小孤山烽火台" , new ModelCity("老古沟小孤山烽火台", 124.36986923217775, 40.25273897061168, 0)); // 位于振安区五龙背老古沟村三组北700米小孤山海拔95米的主峰上。
    modelCities.put("大孤山烽火台" , new ModelCity("大孤山烽火台", 124.2081642150879, 40.25142883558633, 0)); // 位于振安区汤山城镇龙湖村六组西大孤山顶部。
    modelCities.put("平坨烽火台" , new ModelCity("大孤山墩，平坨烽火台", 124.62590217590333, 40.96084500208459, 0)); // 位于宽甸满族自治县双山子镇平坨村王家堡子组东100米的大孤山主峰上。


    modelCities.put("本溪新城" , new ModelCity("本溪新城", 123.681859, 41.493084, 0));
    modelCities.put("本溪" , new ModelCity("本溪", 123.73, 41.3, 0));
    modelCities.put("本溪" , new ModelCity("本溪", 123.73, 41.3, 0));
    modelCities.put("南芬" , new ModelCity("南芬", 123.749338, 41.102486, 0));
    modelCities.put("五龙背" , new ModelCity("五龙背", 124.275293, 40.259806, 0));


    modelCities.put("虎门" , new ModelCity("虎门", 113.673138, 22.860371, 0));
    modelCities.put("龙华" , new ModelCity("龙华", 114.022431, 22.651194, 0));
    modelCities.put("落马洲" , new ModelCity("落马洲", 114.064765, 22.513289, 0));
    modelCities.put("锦上路" , new ModelCity("锦上路", 114.068817, 22.421330, 0));
    modelCities.put("西九龙" , new ModelCity("西九龙", 114.1598013, 22.3036511, 0));
    modelCities.put("保定" , new ModelCity("保定", 115.473333333333, 38.87, 0));
    modelCities.put("高邑" , new ModelCity("高邑", 114.58, 37.62, 0));
    modelCities.put("邢台" , new ModelCity("邢台", 114.48, 37.05, 0));
    modelCities.put("邯郸" , new ModelCity("邯郸", 114.47, 36.6, 0));
    modelCities.put("安阳" , new ModelCity("安阳", 114.35, 36.1, 0));
    modelCities.put("鹤壁" , new ModelCity("鹤壁", 114.17, 35.9, 0));
    modelCities.put("新乡" , new ModelCity("新乡", 113.85, 35.31, 0));
    modelCities.put("许昌" , new ModelCity("许昌", 113.81, 34.02, 0));
    modelCities.put("漯河" , new ModelCity("漯河", 114.02, 33.56, 0));
    modelCities.put("驻马店" , new ModelCity("驻马店", 114.02, 32.98, 0));
    modelCities.put("明港" , new ModelCity("明港", 114.12, 32.1, 0));
    modelCities.put("信阳" , new ModelCity("信阳", 114.08, 32.13, 0));
    modelCities.put("孝感" , new ModelCity("孝感", 113.91, 31.92, 0));
    modelCities.put("荥阳" , new ModelCity("荥阳", 113.35, 34.79, 0));
    modelCities.put("巩义" , new ModelCity("巩义", 112.98, 34.77, 0));
    modelCities.put("洛阳" , new ModelCity("洛阳", 112.44, 34.7, 0));
    modelCities.put("渑池" , new ModelCity("渑池", 111.75, 34.76, 0));
    modelCities.put("三门峡" , new ModelCity("三门峡", 111.19, 34.76, 0));
    modelCities.put("灵宝" , new ModelCity("灵宝", 110.85, 34.52, 0));
//    modelCities.put("华山" , new ModelCity("华山", 110.09, 34.58, 0));
    modelCities.put("渭南" , new ModelCity("渭南", 109.5, 34.52, 0));
    modelCities.put("临潼" , new ModelCity("临潼", 109.22, 34.38, 0));
    modelCities.put("咸阳" , new ModelCity("咸阳", 108.72, 34.36, 0));
    modelCities.put("杨凌" , new ModelCity("杨凌", 108.083055555556, 34.2716666666667, 0));
    modelCities.put("五丈原" , new ModelCity("五丈原", 107.608657, 34.275303, 0));
    modelCities.put("宝鸡" , new ModelCity("宝鸡", 107.15, 34.38, 0));

    modelCities.put("嘉兴" , new ModelCity("嘉兴", 120.763605, 30.764118, 0));
    modelCities.put("诸暨" , new ModelCity("诸暨", 120.23, 29.71, 0));
    modelCities.put("义乌" , new ModelCity("义乌", 120.06, 29.32, 0));
    modelCities.put("金华" , new ModelCity("金华", 119.64, 29.12, 0));
    modelCities.put("衢州" , new ModelCity("衢州", 118.88, 28.97, 0));
    modelCities.put("江山" , new ModelCity("江山", 118.61, 28.74, 0));
    modelCities.put("玉山" , new ModelCity("玉山", 118.25, 28.68, 0));
    modelCities.put("上饶" , new ModelCity("上饶", 117.97, 28.47, 0));
    modelCities.put("弋阳" , new ModelCity("弋阳", 117.43, 28.42, 0));
    modelCities.put("鹰潭" , new ModelCity("鹰潭", 117.02, 28.23, 0));
    modelCities.put("抚州" , new ModelCity("抚州", 116.34, 28, 0));
    modelCities.put("进贤" , new ModelCity("进贤", 116.26, 28.37, 0));
    modelCities.put("高安" , new ModelCity("高安", 115.38, 28.42, 0));
    modelCities.put("新余" , new ModelCity("新余", 114.92, 27.81, 0));
    modelCities.put("宜春" , new ModelCity("宜春", 114.38, 27.81, 0));
    modelCities.put("萍乡" , new ModelCity("萍乡", 113.85, 27.6, 0));
    modelCities.put("醴陵" , new ModelCity("醴陵", 113.5, 27.67, 0));
    modelCities.put("湘潭" , new ModelCity("湘潭", 112.91, 27.87, 0));
    modelCities.put("韶山" , new ModelCity("韶山", 112.528899, 27.921098, 0));
    modelCities.put("娄底" , new ModelCity("娄底", 111.96, 27.71, 0));
    modelCities.put("坪上" , new ModelCity("坪上", 111.531898, 27.533595, 0));
    modelCities.put("洋溪" , new ModelCity("洋溪", 111.187644, 27.662551, 0));
    modelCities.put("隆回" , new ModelCity("隆回", 111.04, 27.13, 0));
    modelCities.put("北斗溪乡" , new ModelCity("北斗溪乡", 110.589158, 27.574028, 0));
    modelCities.put("怀化" , new ModelCity("怀化", 109.95, 27.52, 0));
    modelCities.put("芷江" , new ModelCity("芷江", 109.78, 27.44, 0));
    modelCities.put("晃西" , new ModelCity("晃西", 109.195611, 27.347833, 0));
    modelCities.put("玉屏" , new ModelCity("玉屏", 108.91, 27.24, 0));
    modelCities.put("三穗" , new ModelCity("三穗", 108.675283, 26.954286, 0));
    modelCities.put("台江" , new ModelCity("台江", 108.329193, 26.663953, 0));
    modelCities.put("凯里" , new ModelCity("凯里", 107.891671, 26.529183, 0));
    modelCities.put("贵定" , new ModelCity("贵定", 107.229787, 26.576133, 0));
    modelCities.put("平坝" , new ModelCity("平坝", 106.255081, 26.402071, 0));
    modelCities.put("安顺" , new ModelCity("安顺", 105.943108, 26.228811, 0));
    modelCities.put("黄果树" , new ModelCity("黄果树", 105.6799, 26.014022, 0));
    modelCities.put("普安" , new ModelCity("普安", 104.966730, 25.787850, 0));
    modelCities.put("盘县" , new ModelCity("盘县", 104.64, 25.81, 0));
    modelCities.put("富源" , new ModelCity("富源", 104.24, 25.67, 0));
    modelCities.put("曲靖" , new ModelCity("曲靖", 103.79, 25.51, 0));
    modelCities.put("小哨" , new ModelCity("小哨", 102.992686, 25.165894, 0));
    modelCities.put("亦庄" , new ModelCity("亦庄", 116.481228, 39.799943, 0));
    modelCities.put("永乐" , new ModelCity("永乐", 116.789349, 39.709295, 0));
    modelCities.put("武清" , new ModelCity("武清", 117.05, 39.4, 0));
    modelCities.put("天津" , new ModelCity("天津", 117.2, 39.13, 0));
    modelCities.put("塘沽" , new ModelCity("塘沽", 117.641659, 39.026798, 0));
    modelCities.put("福清" , new ModelCity("福清", 119.383745, 25.720124, 0));
    modelCities.put("莆田" , new ModelCity("莆田", 119.007771, 25.454067, 0));
    modelCities.put("泉州" , new ModelCity("泉州", 118.676766, 24.873019, 0));
    modelCities.put("晋江" , new ModelCity("晋江", 118.552376, 24.780982, 0));
    modelCities.put("厦门" , new ModelCity("厦门", 118.089421, 24.479784, 0));
    modelCities.put("江宁" , new ModelCity("江宁", 118.839971, 31.952779, 0));
    modelCities.put("句容" , new ModelCity("句容", 119.168665, 31.944804, 0));
    modelCities.put("溧水" , new ModelCity("溧水", 119.028508, 31.651233, 0));
    modelCities.put("瓦屋山" , new ModelCity("瓦屋山", 119.274158, 31.558292, 0));
    modelCities.put("溧阳" , new ModelCity("溧阳", 119.484189, 31.416740, 0));
    modelCities.put("宜兴" , new ModelCity("宜兴", 119.823542, 31.340385, 0));
    modelCities.put("长兴" , new ModelCity("长兴", 119.910944, 31.026567, 0));
    modelCities.put("湖州" , new ModelCity("湖州", 120.086873, 30.894236, 0));
    modelCities.put("德清" , new ModelCity("德清", 119.977372, 30.542292, 0));
    modelCities.put("仙西" , new ModelCity("仙西", 118.904687, 32.128294, 0));
    modelCities.put("宝华" , new ModelCity("宝华", 119.010795, 32.152659, 0));
    modelCities.put("镇江" , new ModelCity("镇江", 119.44, 32.2, 0));
    modelCities.put("丹徒" , new ModelCity("丹徒", 119.44, 32.2, 0));
    modelCities.put("丹阳" , new ModelCity("丹阳", 119.55, 32, 0));
    modelCities.put("常州" , new ModelCity("常州", 119.95, 31.79, 0));
    modelCities.put("戚墅堰" , new ModelCity("戚墅堰", 120.06751, 31.722607, 0));
    modelCities.put("惠山" , new ModelCity("惠山", 120.29847, 31.68104, 0));
    modelCities.put("无锡" , new ModelCity("无锡", 120.29, 31.59, 0));
    modelCities.put("苏州" , new ModelCity("苏州", 120.62, 31.32, 0));
    modelCities.put("阳澄湖" , new ModelCity("阳澄湖", 120.861857, 31.381064, 0));
    modelCities.put("昆山" , new ModelCity("昆山", 120.95, 31.39, 0));
    modelCities.put("陆家浜" , new ModelCity("陆家浜", 121.048377, 31.314488, 0));
    modelCities.put("安亭" , new ModelCity("安亭", 121.15859, 31.313234, 0));
    modelCities.put("南翔" , new ModelCity("南翔", 121.309137, 31.279937, 0));
    modelCities.put("松江" , new ModelCity("松江", 121.24, 31, 0));
    modelCities.put("金山" , new ModelCity("金山", 121.16, 30.89, 0));
    modelCities.put("嘉善" , new ModelCity("嘉善", 120.92, 30.84, 0));
    modelCities.put("嘉兴" , new ModelCity("嘉兴", 120.76, 30.77, 0));
    modelCities.put("桐乡" , new ModelCity("桐乡", 120.54, 30.64, 0));
    modelCities.put("海宁" , new ModelCity("海宁", 120.685244, 30.533925, 0));
    modelCities.put("余杭" , new ModelCity("余杭", 120.3, 30.43, 0));
    modelCities.put("深圳公明" , new ModelCity("深圳公明", 113.894664, 22.776304, 0));
    modelCities.put("东涌" , new ModelCity("东涌", 113.454975, 22.884636, 0));
    // modelCities.put("东涌" , new ModelCity("东涌", 113.454974999999, 22.884636, 0));
    modelCities.put("虎门" , new ModelCity("虎门", 113.673138, 22.860371, 0));
    modelCities.put("光明" , new ModelCity("光明", 113.943509, 22.76324, 0));
    modelCities.put("福田" , new ModelCity("福田", 114.055071, 22.521411, 0));
    modelCities.put("六安" , new ModelCity("六安", 116.49, 31.73, 0));
    modelCities.put("汉口" , new ModelCity("汉口", 114.254978, 30.618449, 0));
    modelCities.put("潜江" , new ModelCity("潜江", 112.900066, 30.401897, 0));
    modelCities.put("荆州" , new ModelCity("荆州", 112.239749, 30.334971, 0));
    modelCities.put("枝江" , new ModelCity("枝江", 111.760535, 30.425732, 0));
    modelCities.put("宜昌" , new ModelCity("宜昌", 111.286454, 30.69187, 0));
    modelCities.put("巴东" , new ModelCity("巴东", 110.340756, 31.042197, 0));
    modelCities.put("恩施" , new ModelCity("恩施", 109.488114, 30.271909, 0));
    modelCities.put("万州" , new ModelCity("万州", 108.408594, 30.80778, 0));
    modelCities.put("潼南" , new ModelCity("潼南", 106.22, 30.03, 0));
    modelCities.put("遂宁" , new ModelCity("遂宁", 105.58, 30.52, 0));
    modelCities.put("南充" , new ModelCity("南充", 106.110697, 30.837595, 0));
    modelCities.put("淮南" , new ModelCity("淮南", 116.98, 32.62, 0));
    modelCities.put("长临河" , new ModelCity("长临河", 117.461696, 31.690324, 0));
    modelCities.put("巢湖" , new ModelCity("巢湖", 117.87, 31.62, 0));
    modelCities.put("铜陵" , new ModelCity("铜陵", 117.82, 30.93, 0));
    modelCities.put("南陵" , new ModelCity("南陵", 118.32, 30.91, 0));
    modelCities.put("泾县" , new ModelCity("泾县", 118.41, 30.68, 0));
    modelCities.put("旌德" , new ModelCity("旌德", 118.540494, 30.286154, 0));
    modelCities.put("绩溪" , new ModelCity("绩溪", 118.57, 30.07, 0));
    modelCities.put("黄山" , new ModelCity("黄山", 118.337617, 29.714532, 0));
    modelCities.put("婺源" , new ModelCity("婺源", 117.83, 29.25, 0));
    modelCities.put("德兴" , new ModelCity("德兴", 117.58, 28.96, 0));
    modelCities.put("上饶" , new ModelCity("上饶", 117.97, 28.47, 0));
    modelCities.put("五府山" , new ModelCity("五府山", 118.052604, 28.139573, 0));
    modelCities.put("武夷山" , new ModelCity("武夷山", 118.035305, 27.756448, 0));
    modelCities.put("建阳" , new ModelCity("建阳", 118.120444, 27.331666, 0));
    modelCities.put("建瓯" , new ModelCity("建瓯", 118.32, 27.05, 0));
    modelCities.put("南平" , new ModelCity("南平", 118.16, 26.65, 0));
    modelCities.put("古田" , new ModelCity("古田", 118.746305, 26.57754, 0));
    modelCities.put("闽清" , new ModelCity("闽清", 118.86, 26.21, 0));
    modelCities.put("简阳" , new ModelCity("简阳", 104.53, 30.38, 0));
    modelCities.put("资阳" , new ModelCity("资阳", 104.6, 30.19, 0));
    modelCities.put("资中" , new ModelCity("资中", 104.85, 29.81, 0));
    modelCities.put("内江" , new ModelCity("内江", 105.04, 29.59, 0));
    modelCities.put("隆昌" , new ModelCity("隆昌", 105.25, 29.64, 0));
    modelCities.put("荣昌" , new ModelCity("荣昌", 105.580747, 29.393962, 0));
    modelCities.put("大足" , new ModelCity("大足", 105.740842, 29.427907, 0));
    modelCities.put("永川" , new ModelCity("永川", 105.900401, 29.340105, 0));
    modelCities.put("建始" , new ModelCity("建始", 109.726653, 30.601459, 0));
    modelCities.put("璧山" , new ModelCity("璧山", 106.227363, 29.591827, 0));
    modelCities.put("沙坪坝" , new ModelCity("沙坪坝", 106.457802, 29.540987, 0));
    modelCities.put("星火" , new ModelCity("星火", 116.508818, 39.947939, 0));
    modelCities.put("顺义" , new ModelCity("顺义", 116.65, 40.13, 0));
    modelCities.put("怀柔" , new ModelCity("怀柔", 116.62, 40.32, 0));
    modelCities.put("密云" , new ModelCity("密云", 116.85, 40.37, 0));
    modelCities.put("兴隆" , new ModelCity("兴隆", 117.500553, 40.417269, 0));
    modelCities.put("承德" , new ModelCity("承德", 117.962419, 40.953981, 0));
    modelCities.put("平泉" , new ModelCity("平泉", 118.6833333, 41.01666667, 0));
    modelCities.put("牛河梁" , new ModelCity("牛河梁", 119.509404, 41.295944, 0));
    modelCities.put("喀左" , new ModelCity("喀左", 119.741206, 41.128066, 0));
    modelCities.put("朝阳" , new ModelCity("朝阳", 120.42, 41.58, 0));
    modelCities.put("北票" , new ModelCity("北票", 120.75, 41.82, 0));
    modelCities.put("阜新" , new ModelCity("阜新", 121.670047, 42.022019, 0));
    modelCities.put("黑山" , new ModelCity("黑山", 122.12, 41.7, 0));
    modelCities.put("新民" , new ModelCity("新民", 122.828968, 41.997099, 0));
    modelCities.put("开封" , new ModelCity("开封", 114.35, 34.79, 0));
    modelCities.put("兰考" , new ModelCity("兰考", 114.81, 34.69, 0));
    modelCities.put("商丘" , new ModelCity("商丘", 115.65, 34.44, 0));
    modelCities.put("民权" , new ModelCity("民权", 115.13, 34.65, 0));
    modelCities.put("砀山" , new ModelCity("砀山", 116.34, 34.42, 0));
    modelCities.put("永城" , new ModelCity("永城", 116.37, 33.94, 0));
    modelCities.put("萧县" , new ModelCity("萧县", 116.93, 34.19, 0));
    modelCities.put("门源" , new ModelCity("门源", 101.62, 37.37, 0));
    modelCities.put("民乐" , new ModelCity("民乐", 100.85, 38.43, 0));
    modelCities.put("张掖" , new ModelCity("张掖", 100.46, 38.93, 0));
    modelCities.put("临泽" , new ModelCity("临泽", 100.17, 39.14, 0));
    modelCities.put("酒泉" , new ModelCity("酒泉", 98.5, 39.71, 0));
    modelCities.put("嘉峪关" , new ModelCity("嘉峪关", 98.289156, 39.773053, 0));
    modelCities.put("玉门" , new ModelCity("玉门", 97.58, 39.81, 0));
    modelCities.put("柳园" , new ModelCity("柳园", 95.506807, 41.106829, 0));
    modelCities.put("哈密" , new ModelCity("哈密", 93.44, 42.78, 0));
    modelCities.put("鄯善" , new ModelCity("鄯善", 90.25, 42.82, 0));
    modelCities.put("吐鲁番" , new ModelCity("吐鲁番", 89.19, 42.91, 0));
//    modelCities.put("贵定" , new ModelCity("贵定", 107.229787, 26.576133, 0));
    modelCities.put("龙里" , new ModelCity("龙里", 106.973816, 26.447054, 0));
    modelCities.put("都匀" , new ModelCity("都匀", 107.518728, 26.259305, 0));
    modelCities.put("从江" , new ModelCity("从江", 108.905221, 25.752776, 0));
    modelCities.put("榕江" , new ModelCity("榕江", 108.521875, 25.931797, 0));
    modelCities.put("三江" , new ModelCity("三江", 109.58, 25.8, 0));
    modelCities.put("桂林" , new ModelCity("桂林", 110.28, 25.29, 0));
    modelCities.put("恭城" , new ModelCity("恭城", 110.81, 24.85, 0));
    modelCities.put("贺州" , new ModelCity("贺州", 111.567196, 24.404103, 0));
    modelCities.put("怀集" , new ModelCity("怀集", 112.18, 23.93, 0));
    modelCities.put("肇庆" , new ModelCity("肇庆", 112.44, 23.05, 0));
    modelCities.put("三水" , new ModelCity("三水", 112.89, 23.18, 0));
    modelCities.put("大同" , new ModelCity("大同", 113.3, 40.12, 0));
    modelCities.put("怀仁" , new ModelCity("怀仁", 113.1, 39.82, 0));
    modelCities.put("岱岳" , new ModelCity("岱岳", 112.825173, 39.516807, 0));
    modelCities.put("朔州" , new ModelCity("朔州", 112.432852, 39.331379, 0));
    modelCities.put("宁武" , new ModelCity("宁武", 112.28, 39, 0));
    modelCities.put("原平" , new ModelCity("原平", 112.7, 38.73, 0));
    modelCities.put("忻州" , new ModelCity("忻州", 112.74829, 38.41806, 0));
    modelCities.put("榆次" , new ModelCity("榆次", 112.72, 37.68, 0));
    modelCities.put("太谷" , new ModelCity("太谷", 112.53, 37.42, 0));
    modelCities.put("平遥" , new ModelCity("平遥", 112.18, 37.2, 0));
    modelCities.put("介休" , new ModelCity("介休", 111.88, 37.03, 0));
    modelCities.put("临汾" , new ModelCity("临汾", 111.5, 36.08, 0));
    modelCities.put("侯马" , new ModelCity("侯马", 111.45, 35.03, 0));
    modelCities.put("运城" , new ModelCity("运城", 110.97, 35.03, 0));
    modelCities.put("永济" , new ModelCity("永济", 110.42, 34.88, 0));
    modelCities.put("华山" , new ModelCity("华山", 110.09, 34.58, 0));
    modelCities.put("渭南" , new ModelCity("渭南", 109.5, 34.52, 0));
    modelCities.put("成都" , new ModelCity("成都", 104.073951, 30.697235, 0));
    modelCities.put("安靖" , new ModelCity("安靖", 104.01354, 30.766973, 0));
    modelCities.put("金牛" , new ModelCity("金牛", 103.9904, 30.736269, 0));
    modelCities.put("犀浦" , new ModelCity("犀浦", 103.972097, 30.756002, 0));
    modelCities.put("红光" , new ModelCity("红光", 103.943859, 30.770605, 0));
    modelCities.put("郫县东" , new ModelCity("郫县东", 103.925942, 30.792174, 0));
    modelCities.put("郫县" , new ModelCity("郫县", 103.86, 30.8, 0));
    modelCities.put("郫县西" , new ModelCity("郫县西", 103.879979, 30.82343, 0));
    modelCities.put("安德" , new ModelCity("安德", 103.812055, 30.873907, 0));
    modelCities.put("崇义" , new ModelCity("崇义", 103.730219, 30.916871, 0));
    modelCities.put("聚源" , new ModelCity("聚源", 103.701022, 30.932529, 0));
    modelCities.put("都江堰" , new ModelCity("都江堰", 103.637787, 30.957005, 0));
    modelCities.put("中兴" , new ModelCity("中兴", 103.620441, 30.920203, 0));
    modelCities.put("青城山" , new ModelCity("青城山", 103.606249, 30.891767, 0));
    modelCities.put("九江" , new ModelCity("九江", 115.97, 29.71, 0));
    modelCities.put("庐山" , new ModelCity("庐山", 115.989048, 29.671667, 0));
    modelCities.put("德安" , new ModelCity("德安", 115.75, 29.33, 0));
    modelCities.put("共青城" , new ModelCity("共青城", 115.775496, 29.242148, 0));
    modelCities.put("永修" , new ModelCity("永修", 115.82, 29.04, 0));
    modelCities.put("乐化" , new ModelCity("乐化", 115.870553, 28.813958, 0));
    modelCities.put("榆中" , new ModelCity("榆中", 104.09, 35.87, 0));
    modelCities.put("定西" , new ModelCity("定西", 104.57, 35.57, 0));
    modelCities.put("通渭" , new ModelCity("通渭", 105.27, 35.24, 0));
    modelCities.put("秦安" , new ModelCity("秦安", 105.69, 34.89, 0));
    modelCities.put("天水" , new ModelCity("天水", 105.69, 34.6, 0));
    modelCities.put("东岔" , new ModelCity("东岔", 106.668594, 34.377418, 0));
//    modelCities.put("宝鸡" , new ModelCity("宝鸡", 107.15, 34.38, 0));
    modelCities.put("章丘" , new ModelCity("章丘", 117.53, 36.72, 0));
    modelCities.put("周村" , new ModelCity("周村", 117.860489, 36.791105, 0));
    modelCities.put("淄博" , new ModelCity("淄博", 118.05, 36.78, 0));
    modelCities.put("临淄" , new ModelCity("临淄", 118.056999, 36.789249, 0));
    modelCities.put("青州" , new ModelCity("青州", 118.484468, 36.708428, 0));
    modelCities.put("昌乐" , new ModelCity("昌乐", 118.83, 36.69, 0));
    modelCities.put("潍坊" , new ModelCity("潍坊", 119.1, 36.62, 0));
    modelCities.put("昌邑" , new ModelCity("昌邑", 119.41, 36.86, 0));
    modelCities.put("高密" , new ModelCity("高密", 119.75, 36.38, 0));
    modelCities.put("胶州" , new ModelCity("胶州", 120.033336, 36.264599, 0));
    modelCities.put("藁城" , new ModelCity("藁城", 114.84, 38.03, 0));
    modelCities.put("辛集" , new ModelCity("辛集", 115.213149, 37.9053, 0));
    modelCities.put("衡水" , new ModelCity("衡水", 115.690958, 37.744257, 0));
    modelCities.put("景州" , new ModelCity("景州", 116.270648, 37.692012, 0));
//    modelCities.put("德州" , new ModelCity("德州", 116.29, 37.45, 0));
    modelCities.put("平原" , new ModelCity("平原", 116.44, 37.16, 0));
    modelCities.put("禹城" , new ModelCity("禹城", 116.66, 36.95, 0));
    modelCities.put("齐河" , new ModelCity("齐河", 116.76, 36.79, 0));
    modelCities.put("凌井" , new ModelCity("凌井", 112.936301, 38.050474, 0));
    modelCities.put("阳泉" , new ModelCity("阳泉", 113.57, 37.85, 0));
    modelCities.put("井陉" , new ModelCity("井陉", 114.13, 38.03, 0));
//    modelCities.put("厦门" , new ModelCity("厦门", 118.1, 24.46, 0));
    modelCities.put("角美" , new ModelCity("角美", 117.876103, 24.523993, 0));
    modelCities.put("漳州" , new ModelCity("漳州", 117.716015, 24.456773, 0));
    modelCities.put("漳浦" , new ModelCity("漳浦", 117.563145, 24.096132, 0));
    modelCities.put("云霄" , new ModelCity("云霄", 117.339556, 23.957836, 0));
    modelCities.put("诏安" , new ModelCity("诏安", 117.175180, 23.711371, 0));
    modelCities.put("饶平" , new ModelCity("饶平", 117.003982, 23.663863, 0));
    modelCities.put("潮汕" , new ModelCity("潮汕", 116.587135, 23.539681, 0));
    modelCities.put("潮阳" , new ModelCity("潮阳", 116.601391, 23.265130, 0));
    modelCities.put("普宁" , new ModelCity("普宁", 116.199188, 23.266983, 0));
    modelCities.put("葵潭" , new ModelCity("葵潭", 115.996872, 23.064112, 0));
    modelCities.put("陆丰" , new ModelCity("陆丰", 115.652286, 22.917496, 0));
    modelCities.put("汕尾" , new ModelCity("汕尾", 115.4287, 22.810806, 0));
    modelCities.put("鲘门" , new ModelCity("鲘门", 115.125108, 22.812218, 0));
    modelCities.put("惠东" , new ModelCity("惠东", 114.720183, 22.984924, 0));
    modelCities.put("惠州" , new ModelCity("惠州", 114.416104, 23.111686, 0));
//    modelCities.put("深圳" , new ModelCity("深圳", 114.07, 22.62, 0));

    modelCities.put("绍兴" , new ModelCity("绍兴", 120.58, 30.01, 0));
    modelCities.put("上虞" , new ModelCity("上虞", 120.87, 30.03, 0));
    modelCities.put("余姚" , new ModelCity("余姚", 121.16, 30.04, 0));
    modelCities.put("庄桥" , new ModelCity("庄桥", 121.536071, 29.92323, 0));
    modelCities.put("宁波" , new ModelCity("宁波", 121.56, 29.86, 0));

  }
  private UCity() {

  }

  public static ModelCity getCity(String name) {
    return modelCities.get(name);
  }
  /**
   * @param args
   */
  public static void main(String[] args) {
    Set<String> keys = modelCities.keySet();
    for (String key : keys) {
      System.out.println(modelCities.get(key));
    }
  }
}
