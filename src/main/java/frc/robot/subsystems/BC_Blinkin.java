package frc.robot.subsystems;


// See Documentation :
// https://www.revrobotics.com/content/docs/REV-11-1105-UM.pdf page 14
//
// This is implemented using Spark not Pulse Width
//
// Variable Notation
// Pattern Type_StripPatternColorPalette_NormalAdjustment
// Example:
// 		FPP_RP_PD
//
// 		FPP = Fixed Palette Pattern
// 		RP = Raindbow Palette
// 		PD = Pattern Density
//
//
// Break down of all codes
// Pattern Types:
// 		FPP = Fixed Palette Pattern
// 		COL1 = Color 1 Pattern
// 		COL2 = Color 2 Pattern
// 		COL12 = Color 1 and 2 Pattern
// 		SOL = Solid Colors
//
// Strip Patterns:
// 		RBRB = Rainbow with Rainbow Palette
// 		RBPP = Rainbow with Party Palette
// 		RBOP = Rainbow with Ocean Palette
// 		RBLP = Rainbow with Lave Palette
// 		RBFP = Rainbow with Forest Palette
// 		RBG = Rainbow with Glitter
// 		CONF = Confetti
// 		SHOTR = Shot Red
// 		SHOTB = Shot Blue
//
// 		--!-- There are about 100 more, it would be good to add them at
// some point --!--
//
// Normal Adjustment:
// PD = Pattern Density
// WD = Width Density
// DIM = DIMMING
//
//
// I am only creating the Variables for the ones that we will be using
// as of 2019
//

import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class BC_Blinkin {

    public BC_Blinkin(int channel) {
        blinkinOutput = new Spark(channel);
    }

    public void set(double setting) {
        blinkinOutput.set(setting);
    }

    private final Spark blinkinOutput;

    public static final double BLINKIN_BREATH_BLUE = -0.15;
    public static final double BLINKIN_BREATH_RED = -0.17;
    public static final double BLINKIN_SOLID_RED = 0.61;
    public static final double BLINKIN_SOLID_ORANGE = 0.65;
    public static final double BLINKIN_SOLID_BLUE = 0.87;
    public static final double BLINKIN_SOLID_YELLOW = 0.69;
    public static final double BLINKIN_STROBE_RED = -0.11;
    public static final double BLINKIN_STROBE_BLUE = -0.09;
    public static final double BLINKIN_CONFETTI = -0.87;
    public static final double BLINKIN_BLUE_CHASE =  -0.29;
    public static final double BLINKIN_RAINBOW = -0.99;
    public static final double BLINKIN_FIRE_LARGE = -0.57;
    public static final double BLINKIN_COLOR_WAVE_FOREST = -0.37;
    public static final double BLINKIN_SOLID_BLACK = 0.99;
    public static final double BLINKIN_SOLID_PINK = 0.57;
    public static final double BLINKIN_SOLID_GREEN = 0.77;
    public static final double BLINKIN_SOLID_GOLD = 0.67;
    public static final double BLINKIN_SOLID_VIOLET = 0.91;
}
