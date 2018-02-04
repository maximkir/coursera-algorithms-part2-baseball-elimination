import org.junit.Assert;
import org.junit.Test;

public class BaseballEliminationTest {


    @Test
    public void inputParseTest(){
        BaseballElimination be = new BaseballElimination("data/teams4.txt");
        Assert.assertEquals(4, be.numberOfTeams());
        Assert.assertEquals(83, be.wins("Atlanta"));
        Assert.assertEquals(71, be.losses("Atlanta"));
        Assert.assertEquals(8, be.remaining("Atlanta"));
        Assert.assertEquals(6, be.against("Atlanta", "New_York"));
    }


    @Test
    public void trivialEliminationTest(){
        BaseballElimination be = new BaseballElimination("data/teams4.txt");
        Assert.assertTrue(be.isEliminated("Montreal"));
        Assert.assertFalse(be.isEliminated("New_York"));
    }

    @Test
    public void nonTrivialEliminationTest(){
        BaseballElimination be = new BaseballElimination("data/teams5.txt");
        Assert.assertTrue(be.isEliminated("Detroit"));
    }

    @Test
    public void nonTrivialElimination2Test(){
        BaseballElimination be = new BaseballElimination("data/teams4a.txt");
        Assert.assertTrue(be.isEliminated("Ghaddafi"));
    }
}
