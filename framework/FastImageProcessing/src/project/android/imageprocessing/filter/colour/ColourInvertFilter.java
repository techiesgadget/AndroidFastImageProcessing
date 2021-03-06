package project.android.imageprocessing.filter.colour;

import project.android.imageprocessing.filter.BasicFilter;

/**
 * Inverts the colors of an image
 * @author Chris Batt
 */
public class ColourInvertFilter extends BasicFilter {
	@Override
	protected String getFragmentShader() {
		return 
				"precision mediump float;\n" 
				+"uniform sampler2D "+UNIFORM_TEXTURE0+";\n"  
				+"varying vec2 "+VARYING_TEXCOORD+";\n"	
				
		  		+"void main(){\n"
		  		+"   vec4 color = texture2D("+UNIFORM_TEXTURE0+","+VARYING_TEXCOORD+");\n"
		  		+"   gl_FragColor = vec4((1.0 -color.rgb), color.a);\n"
		  		+"}\n";
	}
}
