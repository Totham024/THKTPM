package data;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = {"mssv", "hoten","ngaysinh"})
public class Person implements Serializable{
		private long mssv;
		public Person(long mssv, String hoten, Date ngaysinh) {
			super();
			this.mssv = mssv;
			this.hoten = hoten;
			this.ngaysinh = ngaysinh;
		}
		@Override
		public String toString() {
			return "Person [mssv=" + mssv + ", hoten=" + hoten + ", ngaysinh=" + ngaysinh + "]";
		}
		public long getMssv() {
			return mssv;
		}
		public void setMssv(long mssv) {
			this.mssv = mssv;
		}
		public String getHoten() {
			return hoten;
		}
		public void setHoten(String hoten) {
			this.hoten = hoten;
		}
		public Date getNgaysinh() {
			return ngaysinh;
		}
		public void setNgaysinh(Date ngaysinh) {
			this.ngaysinh = ngaysinh;
		}
		private String hoten;
		private Date ngaysinh;
		
}
