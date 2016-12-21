package com.yemensoft.barchart;

/**
 * Created by Tasmiya on 06-11-2016.
 */

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MyDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mydata);

        PieChart pieChart1 = (PieChart) findViewById(R.id.piechart1);
        PieChart pieChart2 = (PieChart) findViewById(R.id.piechart2);
        PieChart pieChart3 = (PieChart) findViewById(R.id.piechart3);
        PieChart pieChart4 = (PieChart) findViewById(R.id.piechart4);
        PieChart pieChart5 = (PieChart) findViewById(R.id.piechart5);
        LineChart lineChart = (LineChart) findViewById(R.id.linechart);

        BarChart barChart = (BarChart)findViewById(R.id.barchart);

        ArrayList<Entry> entries1 = new ArrayList<>();
        entries1.add(new Entry(6f, 2));
        entries1.add(new Entry(12f, 3));
        entries1.add(new Entry(18f, 4));
        entries1.add(new Entry(9f, 5));

        PieDataSet dataset1 = new PieDataSet(entries1, "# of Calls");

        ArrayList<String> labels1 = new ArrayList<String>();
        labels1.add("Requests rejected");
        labels1.add("Requests In-Process");
        labels1.add("Requests pending");
        labels1.add("Requests accepted");


        PieData data1 = new PieData(labels1, dataset1);
        dataset1.setColors(ColorTemplate.COLORFUL_COLORS); //
        pieChart1.setDescription("");
        pieChart1.setData(data1);
        pieChart1.getLegend().setEnabled(false);


        pieChart1.animateY(5000);

        ArrayList<Entry> entries2 = new ArrayList<>();
        entries2.add(new Entry(4f, 0));
        entries2.add(new Entry(12f, 3));
        entries2.add(new Entry(18f, 4));
        entries2.add(new Entry(9f, 5));

        PieDataSet dataset2 = new PieDataSet(entries2, "# of Calls");

        ArrayList<String> labels2 = new ArrayList<String>();
        labels2.add("Requests rejected");
        labels2.add("Requests In-Process");
        labels2.add("Requests pending");
        labels2.add("Requests accepted");


        PieData data2 = new PieData(labels2, dataset2);
        dataset2.setColors(ColorTemplate.COLORFUL_COLORS); //
        pieChart2.setDescription("");
        pieChart2.setData(data2);
        pieChart2.getLegend().setEnabled(false);

        pieChart2.animateY(5000);

        ArrayList<Entry> entries3 = new ArrayList<>();
        entries3.add(new Entry(4f, 0));
        entries3.add(new Entry(8f, 1));
        entries3.add(new Entry(6f, 2));
        entries3.add(new Entry(9f, 5));

        PieDataSet dataset3 = new PieDataSet(entries3, "# of Calls");

        ArrayList<String> labels3 = new ArrayList<String>();
        labels3.add("Requests rejected");
        labels3.add("Requests In-Process");
        labels3.add("Requests pending");
        labels3.add("Requests accepted");


        PieData data3 = new PieData(labels3, dataset3);
        dataset3.setColors(ColorTemplate.COLORFUL_COLORS); //
        pieChart3.setDescription("");
        pieChart3.setData(data3);
        pieChart3.getLegend().setEnabled(false);


        pieChart3.animateY(5000);

        ArrayList<Entry> entries4 = new ArrayList<>();

        entries4.add(new Entry(8f, 1));
        entries4.add(new Entry(6f, 2));
        entries4.add(new Entry(12f, 3));
        entries4.add(new Entry(18f, 4));

        PieDataSet dataset4 = new PieDataSet(entries4, "# of Calls");

        ArrayList<String> labels4 = new ArrayList<String>();
        labels4.add("Requests rejected");
        labels4.add("Requests In-Process");
        labels4.add("Requests pending");
        labels4.add("Requests accepted");


        PieData data4 = new PieData(labels4, dataset4);
        dataset4.setColors(ColorTemplate.COLORFUL_COLORS); //
        pieChart4.setDescription("");
        pieChart4.setData(data4);
        pieChart4.getLegend().setEnabled(false);

        pieChart4.animateY(5000);

        ArrayList<Entry> entries5 = new ArrayList<>();
        entries5.add(new Entry(4f, 0));
        entries5.add(new Entry(8f, 1));
        entries5.add(new Entry(18f, 4));
        entries5.add(new Entry(9f, 5));

        PieDataSet dataset5 = new PieDataSet(entries5, "# of Calls");

        ArrayList<String> labels5 = new ArrayList<String>();
        labels5.add("Requests rejected");
        labels5.add("Requests In-Process");
        labels5.add("Requests pending");
        labels5.add("Requests accepted");


        PieData data5 = new PieData(labels5, dataset5);
        dataset5.setColors(ColorTemplate.COLORFUL_COLORS); //
        pieChart5.setDescription("Description");
        pieChart5.setData(data5);

        pieChart5.animateY(5000);

//        pieChart5.saveToGallery("/sd/mychart.jpg", 85); // 85 is the quality of the image


        ArrayList<Entry> lineEntries = new ArrayList<>();
        lineEntries.add(new Entry(4f, 0));
        lineEntries.add(new Entry(6f, 2));
        lineEntries.add(new Entry(2f, 3));
        lineEntries.add(new Entry(18f, 4));




        ArrayList<String> lineLabels = new ArrayList<String>();
        lineLabels.add("Requests rejected");
        lineLabels.add("Requests In-Process");
        lineLabels.add("Requests pending");
        lineLabels.add("Requests accepted");

        LineDataSet dataset6 = new LineDataSet(lineEntries, "# of Calls");

        LineData data = new LineData(lineLabels, dataset6);
        dataset6.setColors(ColorTemplate.COLORFUL_COLORS); //
        dataset6.setDrawFilled(true);

        lineChart.setData(data);
        lineChart.animateY(5000);

        BarData data8 = new BarData(getXAxisValues(), getDataSet());
        barChart.setData(data8);
        barChart.setDescription("");
        barChart.animateXY(2000, 2000);
        barChart.invalidate();




    }

    private ArrayList<BarDataSet> getDataSet() {
        ArrayList<BarDataSet> dataSets = null;

        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        BarEntry v1e1 = new BarEntry(110.000f, 0); // Jan
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(40.000f, 1); // Feb
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(60.000f, 2); // Mar
        valueSet1.add(v1e3);
        BarEntry v1e4 = new BarEntry(30.000f, 3); // Apr
        valueSet1.add(v1e4);


        ArrayList<BarEntry> valueSet2 = new ArrayList<>();
        BarEntry v2e1 = new BarEntry(150.000f, 0); // Jan
        valueSet2.add(v2e1);
        BarEntry v2e2 = new BarEntry(90.000f, 1); // Feb
        valueSet2.add(v2e2);
        BarEntry v2e3 = new BarEntry(120.000f, 2); // Mar
        valueSet2.add(v2e3);
        BarEntry v2e4 = new BarEntry(60.000f, 3); // Apr
        valueSet2.add(v2e4);


        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Brand 1");
        barDataSet1.setColor(Color.rgb(0, 155, 0));
        BarDataSet barDataSet2 = new BarDataSet(valueSet2, "Brand 2");
        barDataSet2.setColors(ColorTemplate.COLORFUL_COLORS);

        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        dataSets.add(barDataSet2);
        return dataSets;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("Requests rejected");
        xAxis.add("Requests In-Process");
        xAxis.add("Requests pending");
        xAxis.add("Requests accepted");

        return xAxis;
    }
    public void add(){
        int i = 1+1;
    }
}
