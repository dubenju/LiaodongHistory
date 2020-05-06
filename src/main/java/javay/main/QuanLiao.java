package javay.main;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.plaf.ColorUIResource;

import javay.awt.ViewMapPanel;
import javay.distance.city.TGraph;
import javay.util.UCity;
import javay.util.graph.DefaultGraph;
import javay.util.graph.DefaultVertex;
import javay.util.graph.Graph;

public class QuanLiao {
    private GoThread t = null;

    private Runnable run = null; // 更新组件的线程
    private Component component = null;
    private ViewMapPanel panel = null;
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                QuanLiao fg = new QuanLiao();
            }
        });
    }
    /**
     * QuanLiao.
     */
    public QuanLiao() {
        DefaultVertex 老龙头 = new DefaultVertex(UCity.getCity("老龙头"));
        DefaultVertex 天下第一关 = new DefaultVertex(UCity.getCity("天下第一关"));
        DefaultVertex 角山长城 = new DefaultVertex(UCity.getCity("角山长城"));
        DefaultVertex 九门口 = new DefaultVertex(UCity.getCity("九门口"));
        DefaultVertex 吾名口 = new DefaultVertex(UCity.getCity("吾名口"));
        DefaultVertex 白石嘴门 = new DefaultVertex(UCity.getCity("白石嘴门"));
        DefaultVertex 毛剌关 = new DefaultVertex(UCity.getCity("毛剌关"));
        DefaultVertex 牛彦章堡 = new DefaultVertex(UCity.getCity("牛彦章堡"));
        DefaultVertex 镇远关= new DefaultVertex(UCity.getCity("镇远关"));
        // 南路
        DefaultVertex 中前所 = new DefaultVertex(UCity.getCity("中前所"));
        DefaultVertex 永安堡 = new DefaultVertex(UCity.getCity("永安堡"));
        DefaultVertex 铁场堡 = new DefaultVertex(UCity.getCity("铁场堡"));
        DefaultVertex 背阴障堡 = new DefaultVertex(UCity.getCity("▼背阴障堡"));

        DefaultVertex 广宁前屯卫 = new DefaultVertex(UCity.getCity("广宁前屯卫")); // 前屯城
        DefaultVertex 三山营堡 = new DefaultVertex(UCity.getCity("三山营堡"));
        DefaultVertex 平川营堡 = new DefaultVertex(UCity.getCity("平川营堡"));
        DefaultVertex 瑞昌堡 = new DefaultVertex(UCity.getCity("瑞昌堡"));
        DefaultVertex 高台营堡 = new DefaultVertex(UCity.getCity("高台营堡"));

        DefaultVertex 中后所 = new DefaultVertex(UCity.getCity("中后所"));
        DefaultVertex 三道沟堡 = new DefaultVertex(UCity.getCity("三道沟堡"));
        DefaultVertex 新兴营堡 = new DefaultVertex(UCity.getCity("新兴营堡"));
        DefaultVertex 锦川营堡 = new DefaultVertex(UCity.getCity("锦川营堡"));

        DefaultVertex 中右所 = new DefaultVertex(UCity.getCity("中右所"));
        DefaultVertex 黑庄窠堡 = new DefaultVertex(UCity.getCity("黑庄窠堡"));
        DefaultVertex 仙灵寺堡 = new DefaultVertex(UCity.getCity("仙灵寺堡"));
        DefaultVertex 小团山堡 = new DefaultVertex(UCity.getCity("小团山堡"));

        DefaultVertex 宁远 = new DefaultVertex(UCity.getCity("宁远"));
        DefaultVertex 首山 = new DefaultVertex(UCity.getCity("首山"));
        DefaultVertex 宁远卫 = new DefaultVertex(UCity.getCity("宁远卫"));
        DefaultVertex 兴水县堡 = new DefaultVertex(UCity.getCity("兴水县堡"));
        DefaultVertex 白塔峪堡 = new DefaultVertex(UCity.getCity("白塔峪堡"));
        DefaultVertex 寨儿山堡 = new DefaultVertex(UCity.getCity("寨儿山堡"));
        DefaultVertex 灰山堡 = new DefaultVertex(UCity.getCity("灰山堡"));

        DefaultVertex 中左所 = new DefaultVertex(UCity.getCity("中左所"));
        DefaultVertex 松山寺堡 = new DefaultVertex(UCity.getCity("松山寺堡"));
        DefaultVertex 长岭山堡 = new DefaultVertex(UCity.getCity("长岭山堡"));
        DefaultVertex 椴木冲堡 = new DefaultVertex(UCity.getCity("椴木冲堡"));
        DefaultVertex 沙河儿堡 = new DefaultVertex(UCity.getCity("沙河儿堡"));

        // 西路
        DefaultVertex 锦州城 = new DefaultVertex(UCity.getCity("锦州城"));
        DefaultVertex 广宁中屯卫 = new DefaultVertex(UCity.getCity("广宁中屯卫"));
        DefaultVertex 广宁左屯卫 = new DefaultVertex(UCity.getCity("广宁左屯卫"));
        DefaultVertex 大兴堡 = new DefaultVertex(UCity.getCity("大兴堡"));
        DefaultVertex 大福堡 = new DefaultVertex(UCity.getCity("大福堡"));
        DefaultVertex 大镇堡 = new DefaultVertex(UCity.getCity("大镇堡"));
        DefaultVertex 大胜堡 = new DefaultVertex(UCity.getCity("大胜堡"));
        DefaultVertex 大茂堡 = new DefaultVertex(UCity.getCity("大茂堡"));

        DefaultVertex 义州 = new DefaultVertex(UCity.getCity("义州"));
        DefaultVertex 义州卫 = new DefaultVertex(UCity.getCity("义州卫"));
        DefaultVertex 广宁后屯卫 = new DefaultVertex(UCity.getCity("广宁后屯卫"));
        DefaultVertex 大定堡 = new DefaultVertex(UCity.getCity("大定堡"));
        DefaultVertex 大安堡 = new DefaultVertex(UCity.getCity("大安堡"));
        DefaultVertex 大康堡 = new DefaultVertex(UCity.getCity("大康堡"));
        DefaultVertex 大平堡 = new DefaultVertex(UCity.getCity("大平堡"));
        DefaultVertex 大宁堡 = new DefaultVertex(UCity.getCity("大宁堡"));
        DefaultVertex 大靖堡 = new DefaultVertex(UCity.getCity("大靖堡"));
        DefaultVertex 大清堡 = new DefaultVertex(UCity.getCity("大清堡"));

        // 中路
        DefaultVertex 广宁 = new DefaultVertex(UCity.getCity("广宁"));
        DefaultVertex 北镇庙 = new DefaultVertex(UCity.getCity("北镇庙"));
        DefaultVertex 广宁卫 = new DefaultVertex(UCity.getCity("广宁卫"));
        DefaultVertex 广宁中卫 = new DefaultVertex(UCity.getCity("广宁中卫"));
        DefaultVertex 广宁左卫 = new DefaultVertex(UCity.getCity("广宁左卫"));
        DefaultVertex 广宁右卫 = new DefaultVertex(UCity.getCity("广宁右卫"));
        DefaultVertex 广宁右屯卫 = new DefaultVertex(UCity.getCity("广宁右屯卫"));
        DefaultVertex 镇夷堡A = new DefaultVertex(UCity.getCity("镇夷堡A"));
        DefaultVertex 镇边堡 = new DefaultVertex(UCity.getCity("镇边堡"));
        DefaultVertex 镇静堡 = new DefaultVertex(UCity.getCity("镇静堡"));
        DefaultVertex 镇安堡 = new DefaultVertex(UCity.getCity("镇安堡"));
        DefaultVertex 镇远堡 = new DefaultVertex(UCity.getCity("镇远堡"));
        DefaultVertex 镇宁堡 = new DefaultVertex(UCity.getCity("镇宁堡"));
        DefaultVertex 镇武堡 = new DefaultVertex(UCity.getCity("镇武堡"));

        // 东路
        DefaultVertex 牛庄 = new DefaultVertex(UCity.getCity("牛庄"));
        DefaultVertex 海州卫 = new DefaultVertex(UCity.getCity("海州卫"));
        DefaultVertex 西兴堡 = new DefaultVertex(UCity.getCity("西兴堡"));
        DefaultVertex 西平堡 = new DefaultVertex(UCity.getCity("西平堡"));
        DefaultVertex 西宁堡 = new DefaultVertex(UCity.getCity("西宁堡"));
        DefaultVertex 东昌堡 = new DefaultVertex(UCity.getCity("东昌堡"));
        DefaultVertex 东胜堡 = new DefaultVertex(UCity.getCity("东胜堡"));
        DefaultVertex 归州堡 = new DefaultVertex(UCity.getCity("归州堡"));

        DefaultVertex 开原城 = new DefaultVertex(UCity.getCity("开原城"));
        DefaultVertex 三万卫 = new DefaultVertex(UCity.getCity("三万卫"));
        DefaultVertex 辽海卫 = new DefaultVertex(UCity.getCity("辽海卫"));
        DefaultVertex 安乐州 = new DefaultVertex(UCity.getCity("安乐州"));
        DefaultVertex 庆云堡 = new DefaultVertex(UCity.getCity("庆云堡"));
        DefaultVertex 古城堡 = new DefaultVertex(UCity.getCity("古城堡"));
        DefaultVertex 永宁堡 = new DefaultVertex(UCity.getCity("▼永宁堡"));
        DefaultVertex 镇夷堡B = new DefaultVertex(UCity.getCity("镇夷堡B"));
        DefaultVertex 清阳堡 = new DefaultVertex(UCity.getCity("清阳堡"));
        DefaultVertex 镇北堡 = new DefaultVertex(UCity.getCity("镇北堡"));
        DefaultVertex 威远堡 = new DefaultVertex(UCity.getCity("威远堡"));
        DefaultVertex 靖安堡 = new DefaultVertex(UCity.getCity("靖安堡"));
        DefaultVertex 松山堡 = new DefaultVertex(UCity.getCity("松山堡"));

        DefaultVertex 沈阳 = new DefaultVertex(UCity.getCity("沈阳"));
        DefaultVertex 沈阳卫 = new DefaultVertex(UCity.getCity("沈阳卫"));

        DefaultVertex 铁岭 = new DefaultVertex(UCity.getCity("铁岭"));
        DefaultVertex 铁岭卫 = new DefaultVertex(UCity.getCity("铁岭卫"));
        DefaultVertex 懿路城 = new DefaultVertex(UCity.getCity("懿路城"));
        DefaultVertex 丁字泊堡 = new DefaultVertex(UCity.getCity("丁字泊堡"));
        DefaultVertex 三岔儿堡 = new DefaultVertex(UCity.getCity("三岔儿堡"));
        DefaultVertex 泛河城 = new DefaultVertex(UCity.getCity("泛河城"));
        DefaultVertex 宋家泊堡 = new DefaultVertex(UCity.getCity("宋家泊堡"));
        DefaultVertex 白家冲堡 = new DefaultVertex(UCity.getCity("▼白家冲堡"));
        DefaultVertex 曾迟堡 = new DefaultVertex(UCity.getCity("曾迟堡"));
        DefaultVertex 抚安堡 = new DefaultVertex(UCity.getCity("抚安堡"));
        DefaultVertex 镇西堡 = new DefaultVertex(UCity.getCity("▼镇西堡"));
        DefaultVertex 彭家湾堡 = new DefaultVertex(UCity.getCity("▼彭家湾堡"));
        DefaultVertex 中固城 = new DefaultVertex(UCity.getCity("中固城"));
        DefaultVertex 定远堡 = new DefaultVertex(UCity.getCity("定远堡"));
        DefaultVertex 柴河堡 = new DefaultVertex(UCity.getCity("柴河堡"));

        DefaultVertex 辽阳 = new DefaultVertex(UCity.getCity("辽阳"));
        DefaultVertex 白塔寺 = new DefaultVertex(UCity.getCity("白塔寺"));
        DefaultVertex 自在州 = new DefaultVertex(UCity.getCity("自在州"));
        DefaultVertex 东宁卫 = new DefaultVertex(UCity.getCity("东宁卫"));
        DefaultVertex 定辽前卫 = new DefaultVertex(UCity.getCity("定辽前卫"));
        DefaultVertex 定辽中卫 = new DefaultVertex(UCity.getCity("定辽中卫"));
        DefaultVertex 定辽后卫 = new DefaultVertex(UCity.getCity("定辽后卫"));
        DefaultVertex 定辽左卫 = new DefaultVertex(UCity.getCity("定辽左卫"));
        DefaultVertex 定辽右卫 = new DefaultVertex(UCity.getCity("定辽右卫"));
        DefaultVertex 长静堡 = new DefaultVertex(UCity.getCity("长静堡"));
        DefaultVertex 长宁堡 = new DefaultVertex(UCity.getCity("长宁堡"));
        DefaultVertex 长定堡 = new DefaultVertex(UCity.getCity("长定堡"));
        DefaultVertex 长安堡 = new DefaultVertex(UCity.getCity("长安堡"));
        DefaultVertex 长胜堡 = new DefaultVertex(UCity.getCity("长胜堡"));
        DefaultVertex 长勇堡 = new DefaultVertex(UCity.getCity("长勇堡"));
        DefaultVertex 长营堡 = new DefaultVertex(UCity.getCity("长营堡"));
        DefaultVertex 武靖营堡 = new DefaultVertex(UCity.getCity("武靖营堡"));

        DefaultVertex 盖州卫 = new DefaultVertex(UCity.getCity("盖州卫"));
        DefaultVertex 熊岳驿堡 = new DefaultVertex(UCity.getCity("熊岳驿堡"));
        DefaultVertex 五十寨堡 = new DefaultVertex(UCity.getCity("▼五十寨堡"));
        DefaultVertex 伏兵堡 = new DefaultVertex(UCity.getCity("▼伏兵堡"));

        DefaultVertex 复州卫 = new DefaultVertex(UCity.getCity("复州卫"));
        DefaultVertex 杨官寨堡 = new DefaultVertex(UCity.getCity("杨官寨堡"));
        DefaultVertex 栾古驿堡 = new DefaultVertex(UCity.getCity("栾古驿堡"));

        DefaultVertex 金州卫 = new DefaultVertex(UCity.getCity("金州卫"));
        DefaultVertex 大黑山 = new DefaultVertex(UCity.getCity("大黑山"));
        DefaultVertex 旅顺口城 = new DefaultVertex(UCity.getCity("旅顺口城"));
        DefaultVertex 木场驿 = new DefaultVertex(UCity.getCity("▼木场驿"));
        DefaultVertex 望海埚堡 = new DefaultVertex(UCity.getCity("望海埚堡"));
        DefaultVertex 红嘴堡 = new DefaultVertex(UCity.getCity("红嘴堡"));
        DefaultVertex 归服堡 = new DefaultVertex(UCity.getCity("▼归服堡"));
        DefaultVertex 黄骨岛堡 = new DefaultVertex(UCity.getCity("黄骨岛堡"));

        DefaultVertex 甜水站堡 = new DefaultVertex(UCity.getCity("甜水站堡"));
        DefaultVertex 青苔峪堡 = new DefaultVertex(UCity.getCity("青苔峪堡"));
        DefaultVertex 镇夷堡 = new DefaultVertex(UCity.getCity("镇夷堡"));
        DefaultVertex 镇东堡 = new DefaultVertex(UCity.getCity("镇东堡"));
        DefaultVertex 凤凰城堡 = new DefaultVertex(UCity.getCity("凤凰城堡"));
        DefaultVertex 汤站堡 = new DefaultVertex(UCity.getCity("汤站堡"));
        DefaultVertex 草河堡 = new DefaultVertex(UCity.getCity("草河堡"));
        DefaultVertex 新安堡 = new DefaultVertex(UCity.getCity("新安堡"));
        DefaultVertex 靉阳堡 = new DefaultVertex(UCity.getCity("靉阳堡"));
        DefaultVertex 洒马吉堡 = new DefaultVertex(UCity.getCity("洒马吉堡"));
        DefaultVertex 硷场堡 = new DefaultVertex(UCity.getCity("硷场堡"));
        DefaultVertex 清河堡 = new DefaultVertex(UCity.getCity("清河堡"));
        DefaultVertex 马根单堡 = new DefaultVertex(UCity.getCity("马根单堡"));
        DefaultVertex 东州堡 = new DefaultVertex(UCity.getCity("东州堡"));
        DefaultVertex 抚顺城 = new DefaultVertex(UCity.getCity("抚顺城"));
        DefaultVertex 抚顺关 = new DefaultVertex(UCity.getCity("抚顺关"));
        DefaultVertex 奉集堡 = new DefaultVertex(UCity.getCity("奉集堡"));
        DefaultVertex 会安堡 = new DefaultVertex(UCity.getCity("会安堡"));
        DefaultVertex 静远堡 = new DefaultVertex(UCity.getCity("静远堡"));
        DefaultVertex 平虏堡 = new DefaultVertex(UCity.getCity("平虏堡"));
        DefaultVertex 上榆林堡 = new DefaultVertex(UCity.getCity("上榆林堡"));
        DefaultVertex 蒲河城 = new DefaultVertex(UCity.getCity("蒲河城"));
        DefaultVertex 十方寺堡 = new DefaultVertex(UCity.getCity("十方寺堡"));
        DefaultVertex 散羊峪堡 = new DefaultVertex(UCity.getCity("▼散羊峪堡"));
        DefaultVertex 一堵墙堡 = new DefaultVertex(UCity.getCity("▼一堵墙堡"));
        DefaultVertex 孤山堡 = new DefaultVertex(UCity.getCity("▼孤山堡"));
        DefaultVertex 张其哈剌佃子 = new DefaultVertex(UCity.getCity("■张其哈剌佃子"));
        DefaultVertex 孤山新堡 = new DefaultVertex(UCity.getCity("■孤山新堡"));
        DefaultVertex 新奠堡 = new DefaultVertex(UCity.getCity("■新奠堡"));
        DefaultVertex 宽奠堡 = new DefaultVertex(UCity.getCity("■宽奠堡"));
        DefaultVertex 大奠子堡 = new DefaultVertex(UCity.getCity("■大奠子堡"));
        DefaultVertex 大奠堡 = new DefaultVertex(UCity.getCity("■大奠堡"));
        DefaultVertex 永奠堡 = new DefaultVertex(UCity.getCity("■永奠堡"));
        DefaultVertex 长奠堡 = new DefaultVertex(UCity.getCity("■长奠堡"));
        DefaultVertex 苏佃子城 = new DefaultVertex(UCity.getCity("■苏佃子城"));
        DefaultVertex 险山堡 = new DefaultVertex(UCity.getCity("▼险山堡"));
        DefaultVertex 宁东堡 = new DefaultVertex(UCity.getCity("宁东堡"));
        DefaultVertex 江沿台堡 = new DefaultVertex(UCity.getCity("江沿台堡"));
        DefaultVertex 镇江堡 = new DefaultVertex(UCity.getCity("■镇江堡"));
        DefaultVertex 南荒沟烽火台 = new DefaultVertex(UCity.getCity("南荒沟烽火台"));
        DefaultVertex 炮台山烽火台 = new DefaultVertex(UCity.getCity("炮台山烽火台"));
        DefaultVertex 钟鼓楼 = new DefaultVertex(UCity.getCity("钟鼓楼"));
        DefaultVertex 虎山长城 = new DefaultVertex(UCity.getCity("虎山长城"));


        Graph graph = new DefaultGraph();



        graph.setEdge(老龙头, 天下第一关, 1);
        graph.setEdge(天下第一关, 角山长城, 1);
        graph.setEdge(角山长城, 九门口, 1);
        graph.setEdge(九门口, 吾名口, 1);
        graph.setEdge(吾名口, 铁场堡, 1);
        graph.setEdge(吾名口, 毛剌关, 1);

        /* 辽西边墙 */
        graph.setEdge(天下第一关, 中前所, 1);
        graph.setEdge(铁场堡, 永安堡, 1);
        graph.setEdge(永安堡, 三山营堡, 1);
        graph.setEdge(中前所, 广宁前屯卫, 1);
        graph.setEdge(三山营堡, 平川营堡, 1);
        graph.setEdge(平川营堡, 瑞昌堡, 1);
        graph.setEdge(瑞昌堡, 高台营堡, 1);
        graph.setEdge(广宁前屯卫, 中后所, 1);

        graph.setEdge(高台营堡, 新兴营堡, 1);
        graph.setEdge(新兴营堡, 三道沟堡, 1);
        graph.setEdge(三道沟堡, 锦川营堡, 1);
        graph.setEdge(中后所, 中右所, 1);

        graph.setEdge(锦川营堡, 黑庄窠堡, 1);
        graph.setEdge(黑庄窠堡, 仙灵寺堡, 1);
        graph.setEdge(仙灵寺堡, 小团山堡, 1);
        graph.setEdge(中右所, 宁远卫, 1);

        graph.setEdge(宁远, 首山, 1);
        graph.setEdge(宁远, 宁远卫, 1);
        graph.setEdge(小团山堡, 兴水县堡, 1);
        graph.setEdge(兴水县堡, 白塔峪堡, 1);
        graph.setEdge(白塔峪堡, 寨儿山堡, 1);
        graph.setEdge(寨儿山堡, 灰山堡, 1);
        graph.setEdge(宁远卫, 中左所, 1);

        graph.setEdge(灰山堡, 松山寺堡, 1);
        graph.setEdge(长岭山堡, 椴木冲堡, 1);
        graph.setEdge(松山寺堡, 沙河儿堡, 1);
        graph.setEdge(长岭山堡, 沙河儿堡, 1);
        graph.setEdge(中左所, 锦州城, 1);


        graph.setEdge(椴木冲堡, 大兴堡, 1);
        graph.setEdge(大兴堡, 大福堡, 1);
        graph.setEdge(大福堡, 大镇堡, 1);
        graph.setEdge(大镇堡, 大胜堡, 1);
        graph.setEdge(大胜堡, 大茂堡, 1);
        graph.setEdge(锦州城, 广宁中屯卫, 1);
        graph.setEdge(锦州城, 广宁左屯卫, 1);
        graph.setEdge(锦州城, 义州卫, 1);

        graph.setEdge(义州卫, 义州, 1);
        graph.setEdge(义州卫, 广宁后屯卫, 1);
        graph.setEdge(大茂堡, 大定堡, 1);
        graph.setEdge(大定堡, 大安堡, 1);
        graph.setEdge(大安堡, 大康堡, 1);
        graph.setEdge(大康堡, 大平堡, 1);
        graph.setEdge(大平堡, 大宁堡, 1);
        graph.setEdge(大宁堡, 大靖堡, 1);
        graph.setEdge(大靖堡, 大清堡, 1);
        graph.setEdge(义州卫, 广宁卫, 1);

        /* 中路 */
        graph.setEdge(广宁卫, 北镇庙, 1);
        graph.setEdge(广宁卫, 广宁, 1);
        graph.setEdge(广宁卫, 广宁中卫, 1);
        graph.setEdge(广宁卫, 广宁左卫, 1);
        graph.setEdge(广宁卫, 广宁右卫, 1);
        graph.setEdge(广宁卫, 广宁右屯卫, 1); // 右屯城
        graph.setEdge(大清堡, 镇夷堡A, 1);
        graph.setEdge(镇夷堡A, 镇边堡, 1);
        graph.setEdge(毛剌关, 镇边堡, 1); // 镇边堡 魏家岭关
        graph.setEdge(镇边堡, 镇静堡, 1);
        graph.setEdge(镇边堡, 镇远堡, 1);
        graph.setEdge(镇静堡, 镇安堡, 1);
        graph.setEdge(镇安堡, 镇远堡, 1);
        graph.setEdge(镇远堡, 镇宁堡, 1);
        graph.setEdge(镇宁堡, 镇武堡, 1);

        /* 东路 */
        graph.setEdge(广宁卫, 海州卫, 1);
        graph.setEdge(牛庄, 海州卫, 1);
        graph.setEdge(镇武堡, 西兴堡, 1);
        graph.setEdge(西兴堡, 西平堡, 1);
        graph.setEdge(西平堡, 东胜堡, 1);

        graph.setEdge(广宁右屯卫, 东昌堡, 1);
        graph.setEdge(东昌堡, 西宁堡, 1);  // 三岔关
        graph.setEdge(镇边堡, 西宁堡, 1);  // 三岔关
        graph.setEdge(西宁堡, 归州堡, 1);
        /* 南路 */
        graph.setEdge(广宁前屯卫, 三山营堡, 1);
        graph.setEdge(广宁前屯卫, 平川营堡, 1);
        graph.setEdge(广宁前屯卫, 瑞昌堡, 1);
        graph.setEdge(广宁前屯卫, 高台营堡, 1); // 高台堡
        graph.setEdge(广宁前屯卫, 中前所, 1);
        graph.setEdge(广宁前屯卫, 中后所, 1);

        graph.setEdge(中前所, 铁场堡, 1);
        graph.setEdge(中前所, 永安堡, 1);
        graph.setEdge(中前所, 背阴障堡, 1);

        graph.setEdge(中后所, 三道沟堡, 1);
        graph.setEdge(中后所, 新兴营堡, 1);
        graph.setEdge(中后所, 锦川营堡, 1);
        graph.setEdge(中后所, 中右所, 1);

        graph.setEdge(中右所, 黑庄窠堡, 1);
        graph.setEdge(中右所, 仙灵寺堡, 1);
        graph.setEdge(中右所, 小团山堡, 1);

        graph.setEdge(宁远, 首山, 1);
        graph.setEdge(宁远, 宁远卫, 1);
        graph.setEdge(宁远卫, 兴水县堡, 1);
        graph.setEdge(宁远卫, 白塔峪堡, 1);
        graph.setEdge(宁远卫, 寨儿山堡, 1);
        graph.setEdge(宁远卫, 灰山堡, 1);
        graph.setEdge(宁远卫, 中左所, 1);
        graph.setEdge(宁远卫, 中右所, 1);

        graph.setEdge(中左所, 松山寺堡, 1);
        graph.setEdge(中左所, 长岭山堡, 1);
        graph.setEdge(中左所, 椴木冲堡, 1);

        graph.setEdge(松山寺堡, 沙河儿堡, 1);
        graph.setEdge(长岭山堡, 沙河儿堡, 1);

        graph.setEdge(中左所, 锦州城, 1);
        graph.setEdge(锦州城, 广宁中屯卫, 1);
        graph.setEdge(锦州城, 广宁左屯卫, 1);
        graph.setEdge(锦州城, 大兴堡, 1);
        graph.setEdge(锦州城, 大福堡, 1);
        graph.setEdge(锦州城, 大镇堡, 1);
        graph.setEdge(锦州城, 大胜堡, 1);
        graph.setEdge(锦州城, 大茂堡, 1);

        graph.setEdge(锦州城, 义州卫, 1);
        graph.setEdge(义州卫, 义州, 1);
        graph.setEdge(义州卫, 广宁后屯卫, 1);
        graph.setEdge(义州卫, 大定堡, 1);
        graph.setEdge(义州卫, 大安堡, 1);
        graph.setEdge(义州卫, 大康堡, 1);
        graph.setEdge(义州卫, 大平堡, 1);
        graph.setEdge(义州卫, 大宁堡, 1);
        graph.setEdge(义州卫, 大清堡, 1);
        graph.setEdge(义州卫, 广宁卫, 1);

        graph.setEdge(大宁堡, 大靖堡, 1);
        graph.setEdge(大靖堡, 大清堡, 1);

        /* 中路 */
        graph.setEdge(广宁卫, 北镇庙, 1);
        graph.setEdge(广宁卫, 广宁, 1);
        graph.setEdge(广宁卫, 广宁中卫, 1);
        graph.setEdge(广宁卫, 广宁左卫, 1);
        graph.setEdge(广宁卫, 广宁右卫, 1);
        graph.setEdge(广宁卫, 广宁右屯卫, 1); // 右屯城
        graph.setEdge(广宁卫, 镇夷堡A, 1);
        graph.setEdge(广宁卫, 镇边堡, 1);
        graph.setEdge(广宁卫, 镇静堡, 1);
        graph.setEdge(广宁卫, 镇安堡, 1);
        graph.setEdge(广宁卫, 镇远堡, 1);
        graph.setEdge(广宁卫, 镇宁堡, 1);
        graph.setEdge(广宁卫, 镇武堡, 1);
        graph.setEdge(广宁卫, 海州卫, 1);

        /* 东路 */
        graph.setEdge(牛庄, 海州卫, 1);
        graph.setEdge(海州卫, 西兴堡, 1);
        graph.setEdge(海州卫, 西平堡, 1);
        graph.setEdge(海州卫, 西宁堡, 1);
        graph.setEdge(海州卫, 东昌堡, 1);
        graph.setEdge(海州卫, 东胜堡, 1);
        // graph.setEdge(海州卫, 归州堡, 1); 去除
        graph.setEdge(海州卫, 盖州卫, 1);
        graph.setEdge(海州卫, 辽阳, 1);

        graph.setEdge(辽阳, 白塔寺, 1);
        graph.setEdge(辽阳, 自在州, 1);
        graph.setEdge(辽阳, 东宁卫, 1);
        graph.setEdge(辽阳, 定辽前卫, 1);
        graph.setEdge(辽阳, 定辽中卫, 1);
        graph.setEdge(辽阳, 定辽后卫, 1);
        graph.setEdge(辽阳, 定辽左卫, 1);
        graph.setEdge(辽阳, 定辽右卫, 1);
        graph.setEdge(辽阳, 长静堡, 1);
        graph.setEdge(辽阳, 长宁堡, 1);
        graph.setEdge(辽阳, 长定堡, 1);
        graph.setEdge(辽阳, 长安堡, 1);
        graph.setEdge(辽阳, 长胜堡, 1);
        graph.setEdge(辽阳, 长勇堡, 1);
        graph.setEdge(辽阳, 长营堡, 1);
        graph.setEdge(辽阳, 武靖营堡, 1);
        graph.setEdge(长静堡, 长宁堡, 1);
        graph.setEdge(长宁堡, 长定堡, 1);
        graph.setEdge(长定堡, 长安堡, 1);
        graph.setEdge(长安堡, 长胜堡, 1);
        graph.setEdge(长胜堡, 长勇堡, 1);
        graph.setEdge(长勇堡, 长营堡, 1);
        graph.setEdge(长营堡, 武靖营堡, 1);
        graph.setEdge(辽阳, 广宁, 1);

        graph.setEdge(抚顺城, 会安堡, 1);

        graph.setEdge(抚顺城, 东州堡, 1);
        graph.setEdge(抚顺关, 东州堡, 1);
        graph.setEdge(马根单堡, 东州堡, 1);
        graph.setEdge(散羊峪堡, 马根单堡, 1);
        graph.setEdge(清河堡, 散羊峪堡, 1);
        graph.setEdge(清河堡, 一堵墙堡, 1);
        graph.setEdge(一堵墙堡, 硷场堡, 1);
        graph.setEdge(硷场堡, 张其哈剌佃子, 1);
        graph.setEdge(孤山堡, 张其哈剌佃子, 1);
        graph.setEdge(孤山新堡, 张其哈剌佃子, 1);
        graph.setEdge(孤山新堡, 孤山堡, 1);
        graph.setEdge(靉阳堡, 孤山堡, 1);

        graph.setEdge(辽阳, 甜水站堡, 1);
        graph.setEdge(甜水站堡, 青苔峪堡, 1);
        graph.setEdge(青苔峪堡, 镇夷堡, 1);
        graph.setEdge(镇夷堡, 镇东堡, 1);
        graph.setEdge(镇东堡, 凤凰城堡, 1);
        graph.setEdge(凤凰城堡, 汤站堡, 1);
        graph.setEdge(凤凰城堡, 新安堡, 1);
        graph.setEdge(汤站堡, 新安堡, 1);
        graph.setEdge(汤站堡, 宁东堡, 1);
        graph.setEdge(汤站堡, 江沿台堡, 1);
        graph.setEdge(宁东堡, 江沿台堡, 1);
        graph.setEdge(宁东堡, 险山堡, 1);
        graph.setEdge(草河堡, 新安堡, 1);
        graph.setEdge(新安堡, 靉阳堡, 1);
        graph.setEdge(新安堡, 险山堡, 1);
        graph.setEdge(靉阳堡, 洒马吉堡, 1);
        graph.setEdge(靉阳堡, 险山堡, 1);
        graph.setEdge(靉阳堡, 新奠堡, 1);
        graph.setEdge(新安堡, 新奠堡, 1);
        graph.setEdge(新奠堡, 宽奠堡, 1);
        graph.setEdge(险山堡, 宽奠堡, 1);
        graph.setEdge(宽奠堡, 大奠子堡, 1);
        graph.setEdge(大奠堡, 大奠子堡, 1);
        graph.setEdge(大奠子堡, 永奠堡, 1);
        graph.setEdge(宁东堡, 永奠堡, 1);
        graph.setEdge(永奠堡, 长奠堡, 1);
        graph.setEdge(江沿台堡, 长奠堡, 1);
        graph.setEdge(长奠堡, 苏佃子城, 1);
        graph.setEdge(江沿台堡, 镇江堡, 1);
        graph.setEdge(汤站堡, 镇江堡, 1);
        graph.setEdge(江沿台堡, 虎山长城, 1);
        graph.setEdge(虎山长城, 南荒沟烽火台, 1);
        graph.setEdge(南荒沟烽火台, 炮台山烽火台, 1);
        graph.setEdge(炮台山烽火台, 钟鼓楼, 1);

        graph.setEdge(马根单堡, 东州堡, 1);
        graph.setEdge(东州堡, 抚顺城, 1);
        graph.setEdge(东州堡, 奉集堡, 1);
        graph.setEdge(抚顺城, 会安堡, 1);

        graph.setEdge(武靖营堡, 奉集堡, 1);

        graph.setEdge(辽阳, 沈阳, 1);
        graph.setEdge(沈阳, 沈阳卫, 1);
        graph.setEdge(沈阳卫, 静远堡, 1);
        graph.setEdge(沈阳卫, 平虏堡, 1);
        graph.setEdge(沈阳卫, 上榆林堡, 1);
        graph.setEdge(沈阳卫, 蒲河城, 1);
        graph.setEdge(蒲河城, 十方寺堡, 1);

        graph.setEdge(静远堡, 平虏堡, 1);
        graph.setEdge(平虏堡, 上榆林堡, 1);
        graph.setEdge(上榆林堡, 蒲河城, 1);

        graph.setEdge(蒲河城, 懿路城, 1);

        /* 北路 */
        graph.setEdge(懿路城, 丁字泊堡, 1);
        graph.setEdge(懿路城, 三岔儿堡, 1);
        graph.setEdge(懿路城, 泛河城, 1);
        graph.setEdge(泛河城, 宋家泊堡, 1);
        graph.setEdge(泛河城, 白家冲堡, 1);
        graph.setEdge(泛河城, 铁岭卫, 1);

        graph.setEdge(铁岭卫, 铁岭, 1);
        graph.setEdge(铁岭卫, 曾迟堡, 1);
        graph.setEdge(铁岭卫, 抚安堡, 1);
        graph.setEdge(铁岭卫, 镇西堡, 1);
        graph.setEdge(铁岭卫, 彭家湾堡, 1);
        graph.setEdge(铁岭卫, 中固城, 1);
        graph.setEdge(中固城, 定远堡, 1);
        graph.setEdge(中固城, 柴河堡, 1);
        graph.setEdge(中固城, 开原城, 1);

        graph.setEdge(开原城, 三万卫, 1);
        graph.setEdge(开原城, 辽海卫, 1);
        graph.setEdge(开原城, 安乐州, 1);
        graph.setEdge(开原城, 庆云堡, 1);
        graph.setEdge(开原城, 庆云堡, 1); // 新安关
        graph.setEdge(西宁堡, 庆云堡, 1); // 三岔关
        graph.setEdge(开原城, 古城堡, 1);
        graph.setEdge(开原城, 永宁堡, 1);
        graph.setEdge(开原城, 镇夷堡B, 1);
        graph.setEdge(开原城, 清阳堡, 1);
        graph.setEdge(庆云堡, 清阳堡, 1); // 新安关
        graph.setEdge(开原城, 镇北堡, 1);
        graph.setEdge(开原城, 威远堡, 1);
        graph.setEdge(清阳堡, 威远堡, 1); // 镇北关
        graph.setEdge(开原城, 靖安堡, 1);
        graph.setEdge(开原城, 松山堡, 1);


        /* 沿海 */
        graph.setEdge(盖州卫, 熊岳驿堡, 1);
        graph.setEdge(熊岳驿堡, 五十寨堡, 1);
        graph.setEdge(五十寨堡, 伏兵堡, 1);
        graph.setEdge(伏兵堡, 复州卫, 1);

        graph.setEdge(复州卫, 杨官寨堡, 1);
        graph.setEdge(复州卫, 栾古驿堡, 1);
        graph.setEdge(栾古驿堡, 金州卫, 1);
        graph.setEdge(复州卫, 金州卫, 1);

        graph.setEdge(金州卫, 大黑山, 1);
        graph.setEdge(金州卫, 木场驿, 1);
        graph.setEdge(木场驿, 旅顺口城, 1);
        graph.setEdge(金州卫, 望海埚堡, 1);
        graph.setEdge(望海埚堡, 红嘴堡, 1);
        graph.setEdge(红嘴堡, 归服堡, 1);
        graph.setEdge(归服堡, 黄骨岛堡, 1);

        System.out.println("Graph is Created.");


      final JFrame frame = new JFrame();
      // ViewMapPanel panel = new ViewMapPanel(graph);
      panel = new ViewMapPanel(graph);
      final JPanel panelBtn = new JPanel();
      JButton dftBtn = new JButton("DFT");
      dftBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ev) {
          System.out.println("DFT begin");
          panel.removeAll();

          graph.depthFirstTraversal(new TGraph(panel, ColorUIResource.GREEN));

          System.out.println("DFT end size:" + panel.getComponentCount());

          t = new GoThread();
          t.start();

        }
      });
      JButton bftBtn = new JButton("BFT");
      bftBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ev) {
          System.out.println("BFT");
          panel.removeAll();

          graph.breathFirstTraversal(new TGraph(panel, ColorUIResource.BLUE));

          t = new GoThread();
          t.start();

        }
      });
      JButton ksjBtn = new JButton("KSJ");
      ksjBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ev) {
          System.out.println("KSJ");
          panel.removeAll();
          graph.kosaraju(new TGraph(panel, ColorUIResource.YELLOW));
          t = new GoThread();
          t.start();
        }
      });
      JButton trjBtn = new JButton("TRJ");
      trjBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ev) {
          System.out.println("TRJ");
          panel.removeAll();
          graph.tarjan(new TGraph(panel, ColorUIResource.BLUE));
        }
      });
      JButton gbwBtn = new JButton("GBW");
      gbwBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ev) {
          System.out.println("GBW");
          panel.removeAll();
          graph.gabow(new TGraph(panel, ColorUIResource.BLUE));
        }
      });
      // JButton b = new JButton("按我", new ImageIcon(".\\icons\\hand.jpg"));
      Container contentPane = frame.getContentPane();
      contentPane.setLayout(new BorderLayout());
      contentPane.add(panel, BorderLayout.CENTER);
      contentPane.add(panelBtn, BorderLayout.LINE_END);
      panelBtn.setLayout(new GridLayout(5, 1));
      panelBtn.add(dftBtn);
      panelBtn.add(bftBtn);
      panelBtn.add(ksjBtn);
      panelBtn.add(trjBtn);
      panelBtn.add(gbwBtn);
      frame.setLocation(0, 0);
      frame.setTitle("1609年全辽示意图");
      frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
      frame.pack();
      frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);

      run = new Runnable() { //实例化更新组件的线程
        public void run() {
          component.repaint();
        }
      };

//      InstructionListener il = new InstructionListener(panel);
//      frame.addKeyListener(il);
    }

    class GoThread extends Thread {
      public void run() {
        for (int i = 0; i < panel.getComponentCount(); i ++) {
          component = panel.getComponent(i);
          //do something...
          go();
        }
        panel.repaint();
      }
    }

    private void go() {
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      SwingUtilities.invokeLater(run);//将对象排到事件派发线程的队列中
    }
}
