import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import java.io.IOException;

public class Redu extends Redu<Text, IntWritable, Text, IntWritable>
 {

	public void reduce(Text key, Iterable<IntWritable> values, Context context)
			throws IOException, InterruptedException 
{
		int y = 0;
		for (IntWritable x : values)
 {
			y += 1;
		}
		context.write(key, new IntWritable(y));
	}
}
