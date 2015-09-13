import org.junit.Assert;
import org.junit.Test;


public class BestLambdaTest {

	@Test
	public void test1() {
		double probsToState1 = 0.5;
		double[] valueEstimates = {0.0,3.0,8.0,2.0,1.0,2.0,0.0};
		double[] rewards = {0.0,0.0,0.0,4.0,1.0,1.0,1.0};
		
		BestLambda l = new BestLambda(probsToState1, valueEstimates, rewards);
		Assert.assertEquals(0.40303171676268473, l.findBestLambda(), 0.005);
	}

	@Test
	public void test2() {
		double probsToState1 = 0.89;
		double[] valueEstimates = {0.0,3.8,1.9,1.5,4.9,0.0,0.0};
		double[] rewards = {-1.9,7.1,1.3,-3.0,2.4,1.7,-0.7};
		
		BestLambda l = new BestLambda(probsToState1, valueEstimates, rewards);
		Assert.assertEquals(0.6575692998786473, l.findBestLambda(), 0.005);
	}

	@Test
	public void test3() {
		double probsToState1 = 0.37;
		double[] valueEstimates = {0.0,2.5,7.9,0.0,2.1,0.0,3.6};
		double[] rewards = {-7.2,1.4,5.3,9.6,-2.3,1.7,-0.7};
		
		BestLambda l = new BestLambda(probsToState1, valueEstimates, rewards);
		Assert.assertEquals(0.3923573691460108, l.findBestLambda(), 0.005);
	}

	@Test
	public void test4() {
		double probsToState1 = 0.9;
	    double[] valueEstimates = {0.0,3.8,1.9,1.5,4.9,0.0,0.0};
	    double[] rewards = {-3.9,7.1,1.3,-3.0,2.4,1.7,-0.7};
		
		BestLambda l = new BestLambda(probsToState1, valueEstimates, rewards);
		Assert.assertEquals(0.6633281342033456, l.findBestLambda(), 0.005);
	}
	
	@Test
	public void test5() {
		double probsToState1 = 0.7;
	    double[] valueEstimates = {0.0,3.8,1.9,1.5,4.9,0.0,3.0};
	    double[] rewards = {-3.9,7.1,1.3,-3.0,2.4,1.7,-0.7};
		
		BestLambda l = new BestLambda(probsToState1, valueEstimates, rewards);
		Assert.assertEquals(0.46780795033654415, l.findBestLambda(), 0.005);
	}
	
	@Test
	public void test6() {
		double probsToState1 = 0.43;
	    double[] valueEstimates = {0.0,-3.8,-10.9,-1.5,-40.9,0.0,-3.0};
	    double[] rewards = {-3.9,-2.1,-1.3,-3.0,-8.4,-1.7,-0.7};
		
		BestLambda l = new BestLambda(probsToState1, valueEstimates, rewards);
		Assert.assertEquals(0.5048390089900506, l.findBestLambda(), 0.005);
	}

}
