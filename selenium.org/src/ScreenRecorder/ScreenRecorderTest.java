package ScreenRecorder;

import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;

public class ScreenRecorderTest {
	public static ScreenRecorder screenRecorder;
	private static final Object MediaTypeKey = null;
	private static final Object MimeTypeKey = null;
	private static final Object MIME_AVI = null;
	private static final Object ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE = null;
	private static final Object EncodingKey = null;
	private static final Object CompressorNameKey = null;
	private static final Object QualityKey = null;
	private static final Object KeyFrameIntervalKey = null;
	private static final Object DepthKey = null;
	private static final Object FrameRateKey = null;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ScreenRecorderTest scr = new ScreenRecorderTest();
		scr.startRecording();
		scr.stopRecording();
		
	}
	public void startRecording() throws IOException, AWTException{
		File file = new File("D:\recording");
		GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().
				getDefaultScreenDevice()
				.getDefaultConfiguration();

		this.screenRecorder = new MyScreenRecorder(gc,
				null, new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
				new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
						CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, 24, FrameRateKey,
						Rational.valueOf(15), QualityKey, 1.0f, KeyFrameIntervalKey, 15 * 60),
				new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black", FrameRateKey, Rational.valueOf(30)),
				null, file, null);
		
		this.screenRecorder.start();
	}
	public void stopRecording() throws Exception {
		screenRecorder.stop();
	}


}
