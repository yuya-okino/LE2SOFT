package ch.idsia.scenarios;

import ch.idsia.benchmark.mario.engine.GlobalOptions;
import ch.idsia.benchmark.tasks.BasicTask;
import ch.idsia.tools.MarioAIOptions;

public final class le2 {
	
	public static void main(String[] args) {
		final MarioAIOptions marioAIOptions = new MarioAIOptions(args);
    
		int seed = 99;
		marioAIOptions.setLevelRandSeed(seed);
    
		//難易度の設定
		int d = 1;
		marioAIOptions.setLevelDifficulty(d);
    
		//敵の有無, マップ
		marioAIOptions.setEnemies("off");
		marioAIOptions.setCannonsCount(false); 
		marioAIOptions.setDeadEndsCount(false);
	    marioAIOptions.setCannonsCount(false);
	    marioAIOptions.setHillStraightCount(false);
	    marioAIOptions.setTubesCount(true); 
	    marioAIOptions.setGapsCount(true);
	    marioAIOptions.setHiddenBlocksCount(false);
	    marioAIOptions.setBlocksCount(true);
	    marioAIOptions.setCoinsCount(true);
	    marioAIOptions.setFlatLevel(false);
		
		final BasicTask basicTask = new BasicTask(marioAIOptions);
		basicTask.setOptionsAndReset(marioAIOptions);
    	basicTask.doEpisodes(1,true,1);
    	
		//画面の大きさ
		//GlobalOptions.changeScale2x();
    
    	
    	
    	
    	System.exit(0);
	}
}
