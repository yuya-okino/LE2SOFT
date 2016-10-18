package ch.idsia.scenarios;

import ch.idsia.agents.controllers.Task2Agent;

public class Hole {
		Task2Agent agent;
		public Hole(){
		}
		
		//穴の横幅(マリオとの相対位置)
		public int getHoleWidth(int m){
			int i=0;
			while(true){
				if(agent.getReceptiveFieldCellValue(agent.marioEgoRow+m+i+1, agent.marioEgoCol+1) == 0){
					break;
				}
				i++;
			}
			return i;
		}
}
