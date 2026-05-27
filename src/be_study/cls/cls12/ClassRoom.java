package be_study.cls.cls12;

import java.util.ArrayList;

public class ClassRoom {	//강의실 교실
	
	//필드
	int floor; //몇층
	int roomNumber; //몇호실이냐
	double area;	//몇명이냐
	boolean hasWhiteBoard; //화이트보드 존재여부
	
	WhiteBoard whiteBoard; //객체
	
	public WhiteBoard getWhiteBoard() {
		return whiteBoard;
	}
	public void setWhiteBoard(WhiteBoard whiteBoard) {
		this.whiteBoard = whiteBoard;
	}


	public ArrayList<Desk> getDeskList() {
		return deskList;
	}

	public void setDeskList(ArrayList<Desk> deskList) {
		this.deskList = deskList;
	}
	
	public void addDesk(Desk desk) {
		//this.deskList = null;	기존에 초기화 안해서 null 인 경우
		
		if( deskList == null) {
			deskList = new ArrayList<Desk> ();
		}
		this.deskList.add(desk);
	}
	
	public void addDesk(int sizeX, int sizeY, String color) {
		
		Desk d = new Desk(sizeX, sizeY, color);
		this.deskList.add(d);
	}


	Aircon aircon;
	
//	Desk desk; //책상 객체 1개
//	Desk desk2;
//	Desk desk3;
//	Desk desk4;
	
	//Desk[] deskArr;
	ArrayList<Desk> deskList;
	
	public ClassRoom() {
		floor = 0;
		roomNumber = 0;
		area = 0;
		hasWhiteBoard = false;
		whiteBoard = null;
		aircon = null;
//		deskList = null;
		deskList = new ArrayList<Desk>();	//ArrayList 공간 초기화
	}
	
	public ClassRoom(int floor, int roomNumber) {
		this.floor = floor;
		this.roomNumber = roomNumber;
	}
	
	public ClassRoom(WhiteBoard whiteBoard, Aircon aircon) {
		this.floor = floor;
		this.roomNumber = roomNumber;
	}
	
	
	

}
