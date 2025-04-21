/* 
* Copyright 2002-2025 FRC 1629
* http://github.com/GaCo-1629
* 
* This program is free software; you can redistribute it and/or
* modify it under the terms of the GNU General Public License
* version 3 as published by the Free Software Foundation or
* available in the root directory of this project.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*/
package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

public final class Main {
	public static void main(String... args) {
		RobotBase.startRobot(Robot::new);
	}

	private Main() {
	}
}
