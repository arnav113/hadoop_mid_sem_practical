import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Mapper.Context;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.DoubleWritable;
import java.io.IOException;

public class Mapp extends Mapp<LongWritable, Text, Text, IntWritable>
 {

	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException 
{
		String inputstring = value.toString();
		for (String x : inputstring.split(" ")) {
			if (x.equals("Apple") || x.equals("Grapes") || x.equals("Banana")) 
{
				context.write(new Text(x), new IntWritable(1));
			}
		}
	}
}
