package com.luv2code.springdemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	public FootballCoach() {
		super();
	}
	
	public FootballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	

	@Override
	public String getDailyFortune() {
		
		return "Just do it: " + fortuneService.getFortune();
	}

}
