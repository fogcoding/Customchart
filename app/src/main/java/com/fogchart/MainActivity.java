package com.fogchart;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fogchart.bean.point;
import com.fogchart.widget.CQSBarChart;
import com.fogchart.widget.CQSCoordinateChart;
import com.fogchart.widget.GaiChart;
import com.fogchart.widget.RfAndRgChart;
import com.fogchart.widget.colorRenderingBarChart;
import com.fogchart.widget.colorRenderingPieChart;
import com.fogchart.widget.colorVectorChart;
import com.fogchart.widget.spectralCurveChart;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private List<View> list = new ArrayList<>();
    double[] data = {0.0098, 0.023, 0.0109, 0.0236, 0.0037, 0.0053, 0.0138, 0.0059, 0.0054, 0.0035, 0.0032, 0.0075, 0.0058, 0.0039, 0.004, 0.0025, 0.0029, 0.0024, 0.0032, 0.0039, 0.0026, 0.0027, 0.0066, 0.0041, 0.0027, 0.0037, 0.0039, 0.005, 0.0051, 0.0041, 0.0069, 0.0047, 0.0063, 0.007, 0.007, 0.0089, 0.0086, 0.01, 0.0115, 0.011, 0.0127, 0.0147, 0.018, 0.0191, 0.0224, 0.0252, 0.029, 0.0325, 0.0372, 0.0424, 0.0497, 0.0561, 0.0653, 0.0741, 0.0848, 0.0995, 0.114, 0.1308, 0.1512, 0.1768, 0.2027, 0.2363, 0.274, 0.3183, 0.3698, 0.4272, 0.4938, 0.5689, 0.6453, 0.7249, 0.8033, 0.8703, 0.9267, 0.9706, 0.9946, 1.0003, 0.983, 0.9535, 0.9066, 0.8511, 0.7918, 0.7262, 0.6666, 0.6109, 0.5609, 0.5175, 0.4762, 0.4395, 0.4065, 0.3765, 0.3453, 0.318, 0.2916, 0.2659, 0.2404, 0.2189, 0.1986, 0.1787, 0.1617, 0.1469, 0.1338, 0.1226, 0.1136, 0.1046, 0.0982, 0.0923, 0.088, 0.0828, 0.0797, 0.0775, 0.0755, 0.0744, 0.0755, 0.0758, 0.0777, 0.0799, 0.0836, 0.0885, 0.0939, 0.1007, 0.1094, 0.119, 0.1317, 0.1452, 0.1615, 0.1796, 0.1993, 0.2246, 0.2503, 0.2804, 0.3117, 0.3475, 0.3867, 0.4283, 0.474, 0.5226, 0.572, 0.6212, 0.6741, 0.7234, 0.7758, 0.8646, 0.9061, 0.9393, 0.9649, 0.9843, 0.9986, 1.0017, 1.0001, 0.9877, 0.9708, 0.9483, 0.9202, 0.888, 0.852, 0.8161, 0.7794, 0.7428, 0.705, 0.6716, 0.6373, 0.6053, 0.5748, 0.5462, 0.5185, 0.4925, 0.4666, 0.443, 0.4213, 0.3987, 0.376, 0.357, 0.3355, 0.3153, 0.2968, 0.2795, 0.2601, 0.2444, 0.2297, 0.2142, 0.2002, 0.1874, 0.1756, 0.1651, 0.1538, 0.1449, 0.1355, 0.1277, 0.1213, 0.1149, 0.1083, 0.1018, 0.0972, 0.093, 0.0894, 0.085, 0.0815, 0.0799, 0.0767, 0.0764, 0.0752, 0.0744, 0.0754, 0.0764, 0.0772, 0.0797, 0.0823, 0.0868, 0.0914, 0.0969, 0.1047, 0.1134, 0.124, 0.1327, 0.1452, 0.1596, 0.1747, 0.1934, 0.2125, 0.2319, 0.2592, 0.2896, 0.3187, 0.3541, 0.3945, 0.4391, 0.4925, 0.5514, 0.6181, 0.6876, 0.7688, 0.8614, 0.9664, 0.8777, 0.8104, 0.0098, 0.023, 0.0109, 0.0236, 0.0037, 0.0053, 0.0138, 0.0059, 0.0054, 0.0035, 0.0032, 0.0075, 0.0058, 0.0039, 0.004, 0.0025, 0.0029, 0.0024, 0.0032, 0.0039, 0.0026, 0.0027, 0.0066, 0.0041, 0.0027, 0.0037, 0.0039, 0.005, 0.0051, 0.0041, 0.0069, 0.0047, 0.0063, 0.007, 0.007, 0.0089, 0.0086, 0.01, 0.0115, 0.011, 0.0127, 0.0147, 0.018, 0.0191, 0.0224, 0.0252, 0.029, 0.0325, 0.0372, 0.0424, 0.0497, 0.0561, 0.0653, 0.0741, 0.0848, 0.0995, 0.114, 0.1308, 0.1512, 0.1768, 0.2027, 0.2363, 0.274, 0.3183, 0.3698, 0.4272, 0.4938, 0.5689, 0.6453, 0.7249, 0.8033, 0.8703, 0.9267, 0.9706, 0.9946, 1.0003, 0.983, 0.9535, 0.9066, 0.8511, 0.7918, 0.7262, 0.6666, 0.6109, 0.5609, 0.5175, 0.4762, 0.4395, 0.4065, 0.3765, 0.3453, 0.318, 0.2916, 0.2659, 0.2404, 0.2189, 0.1986, 0.1787, 0.1617, 0.1469, 0.1338, 0.1226, 0.1136, 0.1046, 0.0982, 0.0923, 0.088, 0.0828, 0.0797, 0.0775, 0.0755, 0.0744, 0.0755, 0.0758, 0.0777, 0.0799, 0.0836, 0.0885, 0.0939, 0.1007, 0.1094, 0.119, 0.1317, 0.1452, 0.1615, 0.1796, 0.1993, 0.2246, 0.2503, 0.2804, 0.3117, 0.3475, 0.3867, 0.4283, 0.474, 0.5226, 0.572, 0.6212, 0.6741, 0.7234, 0.7758, 0.823, 0.8646, 0.9061, 0.9393, 0.9649, 0.9843, 0.9986, 1.0017, 1.0001, 0.9877, 0.9708, 0.9483, 0.9202,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager);

        View v_bar = LayoutInflater.from(MainActivity.this).inflate(R.layout.bar, null);
        double[] bar = {10, 80, 30, 50, 45, 19, 30, 88, 54, 12, 44, 55, 66, 77, 88, 70};
        colorRenderingBarChart barChart = v_bar.findViewById(R.id.colorbar);
        barChart.setData(bar);
        list.add(v_bar);

        View v_pie = LayoutInflater.from(MainActivity.this).inflate(R.layout.pie, null);
        double[] pie = {10, 80, 30, 50, 45, 19, 30, 88, 54, 12, 44, 55, 66, 77, 88, 70};
        colorRenderingPieChart pieChart = v_pie.findViewById(R.id.clolorpie);
        pieChart.setData(pie);
        list.add(v_pie);

        View v_color_mix = LayoutInflater.from(MainActivity.this).inflate(R.layout.colormix, null);
        list.add(v_color_mix);

        View v_cqs1 = LayoutInflater.from(MainActivity.this).inflate(R.layout.cqs1, null);
        CQSBarChart cqsBarChart = v_cqs1.findViewById(R.id.cqs1);
        double[] data_cqs1 = {10, 80, 30, 50, 45, 19, 30, 88, 54, 12, 44, 55, 66, 77,46,72};
        cqsBarChart.setData(data_cqs1);
        list.add(v_cqs1);

        View v_cqs2 = LayoutInflater.from(MainActivity.this).inflate(R.layout.cqs2, null);
        CQSCoordinateChart cqsCoordinateChart = v_cqs1.findViewById(R.id.cqs2);
        list.add(v_cqs2);

        View v_gai = LayoutInflater.from(MainActivity.this).inflate(R.layout.gai, null);
        GaiChart gaiChart = v_gai.findViewById(R.id.gai);
        ArrayList<point> gai_points = new ArrayList<>();
        gai_points.add(new point(0.33f,0.55f));
        gai_points.add(new point(0.53f,0.25f));
        gaiChart.setData(gai_points);
        list.add(v_gai);

        View v_light = LayoutInflater.from(MainActivity.this).inflate(R.layout.light, null);
        spectralCurveChart curveChart = v_light.findViewById(R.id.light);
        curveChart.setData(data);
        list.add(v_light);

        View v_rf_rg = LayoutInflater.from(MainActivity.this).inflate(R.layout.rf_fg, null);
        RfAndRgChart rfAndRgChart = v_rf_rg.findViewById(R.id.rf);
        list.add(v_rf_rg);

        View v_color_vector = LayoutInflater.from(MainActivity.this).inflate(R.layout.colorvector, null);
        colorVectorChart colorVectorChart = v_color_vector.findViewById(R.id.colorvector);
        list.add(v_color_vector);













        viewPager.setAdapter(new FogAdapter(list));


    }


    class FogAdapter extends PagerAdapter {

        private List<View> views;

        public FogAdapter(List<View> views) {
            this.views = views;
        }

        @Override
        public int getCount() {
            return views.size();
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            return view == o;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            container.addView(views.get(position));
            return views.get(position);
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView(views.get(position));
        }
    }


}
