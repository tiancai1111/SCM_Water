package util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import pojo.Repertory;

public class Exportexcel {
	public static  int Excel(String title, String[] headers, List<Repertory> dataset, String fileName) {
		int result = 1;
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet(title);
		// 起始行，起始列，结束行，结束列
		  HSSFRow row = sheet.createRow(0);
		  HSSFCell cell = null;
	/*	  {"商品Id","商品名","商品进价","商品销售价","商品成本价",
			  "商品说明","商品销量","库存数量","库存充裕状态"}*/
		for (int i = 0; i < headers.length; i++) {
			cell = row.createCell(i);
			cell.setCellValue(headers[i]);
		}
		for (int i = 0; i < dataset.size(); i++) {
			Repertory repertory=dataset.get(i);
			row = sheet.createRow(i+1);
			cell = row.createCell(0);
			cell.setCellValue(repertory.getCommodityid());
			cell = row.createCell(1);
			cell.setCellValue(repertory.getCommodityname());
			cell = row.createCell(2);
			cell.setCellValue(repertory.getCommodityenter());
			cell = row.createCell(3);
			cell.setCellValue(repertory.getCommoditysale());
			cell = row.createCell(4);
			cell.setCellValue(repertory.getCommoditycost());
			cell = row.createCell(5);
			cell.setCellValue(repertory.getState());
			cell = row.createCell(6);
			cell.setCellValue(repertory.getCommodityQuantity());
			cell = row.createCell(7);
			cell.setCellValue(repertory.getRepertoryamount());
			cell = row.createCell(8);
			cell.setCellValue(repertory.getRepertorystate());
		}
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			workbook.write(fos);
		} catch (IOException e) {
			result=0;
			e.printStackTrace();
		}
		return result;

	}
}
