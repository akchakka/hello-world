
import com.vehiclereg.VehicleDataReader;
import org.hamcrest.core.IsNull;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
	
public class VehicleRegTest {
	
	    @Test
	    public void test_HondaDataCheck() {
	        String line = "X131 KCR|HONDA|White";
	        List<String> result = VehicleDataReader.parseLine(line, '|');
	        assertThat(result, IsNull.notNullValue());
	        assertThat(result.size(), is(3));
	        assertThat(result.get(0), is("X131 KCR"));
	        assertThat(result.get(1), is("HONDA"));
	        assertThat(result.get(2), is("White"));
	    }

	    @Test
	    public void test_FordDataCheck() {
	        String line = "Y456 ABC|Ford|Blue";
	        List<String> result = VehicleDataReader.parseLine(line, '|', '\'');
	        assertThat(result, IsNull.notNullValue());
	        assertThat(result.size(), is(3));
	        assertThat(result.get(0), is("Y456 ABC"));
	        assertThat(result.get(1), is("Ford"));
	        assertThat(result.get(2), is("Blue"));
	    }

	    @Test
	    public void test_HundaiDataCheck() {
	        String line = "G465 ARK|Hundai|Green";
	        List<String> result = VehicleDataReader.parseLine(line, '|', '\'');
	        assertThat(result, IsNull.notNullValue());
	        assertThat(result.size(), is(3));
	        assertThat(result.get(0), is("G465 ARK"));
	        assertThat(result.get(1), is("Hundai"));
	        assertThat(result.get(2), is("Green"));
	    }
	   
	    @Test
	    public void test_AudiDataCheck() {
	        String line = "H465 THG|Audi|Black";
	        List<String> result = VehicleDataReader.parseLine(line, '|', '\'');
	        assertThat(result, IsNull.notNullValue());
	        assertThat(result.size(), is(3));
	        assertThat(result.get(0), is("H465 THG"));
	        assertThat(result.get(1), is("Audi"));
	        assertThat(result.get(2), is("Black"));
	    }
	    @Test
	    public void test_VWDataCheck() {
	        String line = "R465 UHG|VW|Silver";
	        List<String> result = VehicleDataReader.parseLine(line, '|', '\'');
	        assertThat(result, IsNull.notNullValue());
	        assertThat(result.size(), is(3));
	        assertThat(result.get(0), is("R465 UHG"));
	        assertThat(result.get(1), is("VW"));
	        assertThat(result.get(2), is("Silver"));
	    }
	    
	    @Test
	    public void test_FiatDataCheck() {
	        String line = "K44 RHA|Fiat|Red";
	        List<String> result = VehicleDataReader.parseLine(line, '|', '\'');
	        assertThat(result, IsNull.notNullValue());
	        assertThat(result.size(), is(3));
	        assertThat(result.get(0), is("K44 RHA"));
	        assertThat(result.get(1), is("Fiat"));
	        assertThat(result.get(2), is("Red"));
	    }
	    
	    @Test
	    public void test_MercedesDataCheck() {
	        String line = "GH12 RTA|Mercedes|Silver";
	        List<String> result = VehicleDataReader.parseLine(line, '|', '\'');
	        assertThat(result, IsNull.notNullValue());
	        assertThat(result.size(), is(3));
	        assertThat(result.get(0), is("GH12 RTA"));
	        assertThat(result.get(1), is("Mercedes"));
	        assertThat(result.get(2), is("Silver"));
	    }
}
