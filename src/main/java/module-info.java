// Created 2021-11-07T05:15:41

/**
 * @author Ampflower
 * @since ${version}
 **/
module gay.ampflower.database {
	requires java.sql;
	requires org.objectweb.asm;

	exports gay.ampflower.hachimitsu.database.api;
	exports gay.ampflower.hachimitsu.database.api.annotation;
}