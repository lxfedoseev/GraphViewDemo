package com.jjoe64.graphview;

import android.graphics.Color;

/**
 * Styles for the GraphView
 * Important: Use GraphViewSeries.GraphViewSeriesStyle for series-specify styling
 *
 */
public class GraphViewStyle {
	private int vLabelsColor;
	private int hLabelsColor;
	private int gridColor;
	
	//alexfed begin
	private int labelBorder;
	private int labelFontSize;
	private int vLabelWidth;
	//alexfed end

	public GraphViewStyle() {
		vLabelsColor = Color.WHITE;
		hLabelsColor = Color.WHITE;
		gridColor = Color.DKGRAY;
		//alexfed begin
		labelBorder = 20;
		labelFontSize = 14;
		vLabelWidth = 100;
		//alexfed end
	}

	public GraphViewStyle(int vLabelsColor, int hLabelsColor, int gridColor) {
		this.vLabelsColor = vLabelsColor;
		this.hLabelsColor = hLabelsColor;
		this.gridColor = gridColor;
	}
	
	//alexfed begin
	public GraphViewStyle(int vLabelsColor, int hLabelsColor, int gridColor, 
			int labelBorder, int labelFontSize, int vLabelWidth) {
		this.vLabelsColor = vLabelsColor;
		this.hLabelsColor = hLabelsColor;
		this.gridColor = gridColor;
		this.labelBorder = labelBorder;
		this.labelFontSize = labelFontSize;
		this.vLabelWidth = vLabelWidth;
	}
	//alexfed end

	public int getVerticalLabelsColor() {
		return vLabelsColor;
	}

	public int getHorizontalLabelsColor() {
		return hLabelsColor;
	}

	public int getGridColor() {
		return gridColor;
	}

	public void setVerticalLabelsColor(int c) {
		vLabelsColor = c;
	}

	public void setHorizontalLabelsColor(int c) {
		hLabelsColor = c;
	}

	public void setGridColor(int c) {
		gridColor = c;
	}
	
	//alexfed begin: new style parameters
	public int getLabelBorder() {
		return labelBorder;
	}
	
	public int getLabelFontSize() {
		return labelFontSize;
	}
	
	public int getVerticalLabelWidth() {
		return vLabelWidth;
	}
	
	public void setLabelBorder(int c) {
		labelBorder = c;
	}
	
	public void setLabelFontSize(int c) {
		labelFontSize = c;
	}
	
	public void setVerticalLabelWidth(int c) {
		vLabelWidth = c;
	}
	//alexfed end
}
