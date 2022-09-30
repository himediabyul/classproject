package chapter11.exam;

import java.util.Objects;

public class FootballPlayer implements Comparable<FootballPlayer> {
//	1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다. 

	private String name;
	private int number;
	private String team;
	private int age;
		
	public FootballPlayer(String name, int number, String team, int age) {
		super();
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
		
	}
	public FootballPlayer() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public String getTeam() {
		return team;
	}

	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}


//	2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name, team);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj !=null && obj instanceof FootballPlayer) {
			FootballPlayer list = (FootballPlayer) obj;
			
//			result = team.equals(list.getTeam())
//					&& name.equals(list.getName())
//					&& age.equals(list.getAge());
			
			return age == list.age && Objects.equals(name, list.name) && Objects.equals(team, list.team);	
		}
		return result;
		
	}
	@Override
	public int compareTo(FootballPlayer o) {
		//팀이름 -> 선수이름 -> 번호
		int result= team.compareTo(o.getTeam());
		if(result == 0) {
			result = name.compareTo(getName());
			if(result == 0) {
				result = number - o.getNumber();
			}
		}
		return result;
	}

}


