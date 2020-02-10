package ec.edu.ups.graphic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.chart.LineChartModel;

import ec.edu.ups.*;

import org.primefaces.model.chart.*;

@Named
@RequestScoped
public class Grafica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LineChartModel lineModel1;
	// private LineChartModel lineModel2;
	private LineChartModel zoomModel;
	private CartesianChartModel combinedModel;
	private CartesianChartModel fillToZero;
	private LineChartModel areaModel;
	private BarChartModel barModel;
	private HorizontalBarChartModel horizontalBarModel;
	private PieChartModel pieModel1;
	private PieChartModel pieModel2;
	private DonutChartModel donutModel1;
	private DonutChartModel donutModel2;
	private MeterGaugeChartModel meterGaugeModel1;
	private MeterGaugeChartModel meterGaugeModel2;
	private BubbleChartModel bubbleModel1;
	private BubbleChartModel bubbleModel2;
	private OhlcChartModel ohlcModel;
	private OhlcChartModel ohlcModel2;
	// private PieChartModel livePieModel;
	private LineChartModel animatedModel1;
	private BarChartModel animatedModel2;
	private LineChartModel multiAxisModel;
	private LineChartModel dateModel;

	@PostConstruct
	public void init() {
		 createLineModels();
		// createAreaModel();
		// createPieModels();
		// createDonutModels();
		// createBubbleModels();
		// createOhlcModels();
		// createFillToZero();
		// createMeterGaugeModels();
		// createBarModels();
		createAnimatedModels();
		// createCombinedModel();
		// createMultiAxisModel();
		//createDateModel();
	}

	
	public LineChartModel getAnimatedModel1() {
		return animatedModel1;
	}

	public LineChartModel getMultiAxisModel() {
		return multiAxisModel;
	}

	public LineChartModel getDateModel() {
		return dateModel;
	}

	private LineChartModel initLinearModel() {
		LineChartModel model = new LineChartModel();

		LineChartSeries series1 = new LineChartSeries();	
		series1.setLabel("Series 1");
		series1.setMarkerStyle("PATITO");
		int j;
		//series1.setFill(true);
		for (int i = 2; i < 10; i++) {
			
			for (j = 0; j < 10; j++) {
				
				
			
			
			}
			series1.set(i,j);	
		
		}
				
		model.addSeries(series1);	
		
		LineChartSeries series2 = new LineChartSeries();
		series2.setLabel("Series 2");

		series2.set(1, 6);
		series2.set(2, 3);
		series2.set(3, 2);
		series2.set(4, 7);
		series2.set(20, 9);

		
		model.addSeries(series2);

		return model;
	}

	private void createAnimatedModels() {
		animatedModel1 = initLinearModel();
		animatedModel1.setTitle("Line Chart");
		animatedModel1.setAnimate(true);
		animatedModel1.setLegendPosition("se");
		Axis yAxis = animatedModel1.getAxis(AxisType.Y);
		yAxis.setMin(0);
		yAxis.setMax(10);

	}


	 private void createLineModels() {
	        lineModel1 = initLinearModel();
	        lineModel1.setTitle("Linear Chart");
	        lineModel1.setLegendPosition("e");
	        Axis yAxis = lineModel1.getAxis(AxisType.Y);
	        yAxis.setMin(0);
	        yAxis.setMax(10);
	 
	        
	 
	        zoomModel = initLinearModel();
	        zoomModel.setTitle("Zoom");
	        zoomModel.setZoom(true);
	        zoomModel.setLegendPosition("e");
	        yAxis = zoomModel.getAxis(AxisType.Y);
	        yAxis.setMin(0);
	        yAxis.setMax(10);
	    }
	

}
