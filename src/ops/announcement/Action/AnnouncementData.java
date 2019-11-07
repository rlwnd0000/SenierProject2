package ops.announcement.Action;

import static common.ConUtilDAO.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import ops.announcement.Beans.Announcement;


public class AnnouncementData {
	Connection con;
	PreparedStatement ps = null;
	ResultSet rs = null;	
	private static AnnouncementData instance;
	
	public static AnnouncementData getInstance(){
		if(instance == null)
			instance = new AnnouncementData();
		return instance;
	}
	
	public void setConnection(Connection con) {
		this.con = con;
	}
	
	public int insertAnnouncement(Announcement a) { //공지사항작성 
		int x = 0;
		try {
			String sql = "insert into announcement values(null,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, a.getA_id());
			ps.setString(2, a.getA_title());
			ps.setString(3, a.getA_content());
			ps.setTimestamp(4, a.getA_date());
			ps.setString(5, a.getA_img());
			x = ps.executeUpdate();
		
		}catch(Exception e) {
			System.out.println("공지사항작성오류:"+ e);
		}finally {
			close(ps);
		}
		return x;
	}
	
	public ArrayList<Announcement> selectAnnouncementList(){ //공지사항리스트
		String sql="select * from announcement";
		ArrayList<Announcement> announcementList = new ArrayList<Announcement>();
		try{
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next())
				do{
				Announcement a = new Announcement();
				a = new Announcement();
				a.setA_no(rs.getInt("a_no"));
				a.setA_id(rs.getString("a_id"));
				a.setA_title(rs.getString("a_title"));
				a.setA_content(rs.getString("a_content"));
				a.setA_date(rs.getTimestamp("a_date"));
				a.setA_img(rs.getString("a_img"));
				announcementList.add(a);
				}while(rs.next());
		}catch(Exception e){
			System.out.println("공지사항리스트오류 :" + e);			
		}finally{
			close(rs);
			close(ps);
		}
		return announcementList;
	}
	
	public Announcement selectAnnouncementDetail(int a_no) {
		Announcement a = null;
		try {
			String sql = "select * from announcement where a_no=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, a_no);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				a = new Announcement();
				a.setA_no(rs.getInt("a_no"));
				a.setA_id(rs.getString("a_id"));
				a.setA_title(rs.getString("a_title"));
				a.setA_content(rs.getString("a_content"));
				a.setA_date(rs.getTimestamp("a_date"));
				a.setA_img(rs.getString("a_img"));
				}
			
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				close(rs);
				close(ps);
			}
			return a;
		}
	
	public boolean isAnnouncementNo(int a_no){ //공지사항번호조회
		String sql="select * from announcement where a_no=?";
		boolean isNo = false;
			
		try{
			ps = con.prepareStatement(sql);
			ps.setInt(1, a_no);
			rs = ps.executeQuery();
			if(rs.next()) {
				isNo = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			close(ps);
		}
		return isNo;
	}
	
	public int updateAnnouncement(Announcement a){ //공지업데이트
		String sql="update announcement set a_title=?, a_content=?, a_img=? where a_no=?";
		int x = 0;
		
		try{
			ps = con.prepareStatement(sql);
			ps.setString(1, a.getA_title());
			ps.setString(2, a.getA_content());
			ps.setString(3, a.getA_img());
			ps.setInt(4, a.getA_no());
			x = ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			close(ps);
		}
		return x;
	}
	
	public int deleteAnnouncement(int a_no) { //공지삭제
		String sql = "delete from announcement where a_no=?";
		int x = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, a_no);
			x = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(ps);
		}
		return x;
	}
}



