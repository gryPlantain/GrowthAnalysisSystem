import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;


public class ExtractXBRLMap implements Mapper<Text, Text,Text, Text> {

	public void configure(JobConf arg0) {
		// TODO Auto-generated method stub
		
	}

	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}

	public void map(K1 arg0, V1 arg1, OutputCollector<K2, V2> arg2,
			Reporter arg3) throws IOException {
		// TODO Auto-generated method stub
		
	}

	public void map(Text arg0, Text arg1, OutputCollector<Text, Text> arg2,
			Reporter arg3) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
