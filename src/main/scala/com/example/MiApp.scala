package com.example

import org.apache.spark.{SparkContext, SparkConf}

object MiApp {

    def main(args: Array[String]) {

        val conf = new SparkConf().setAppName("MiApp").setMaster("local[2]")
        val sc = new SparkContext(conf)

        val rdd = sc.parallelize(List("Hello", "World"))

        val phrase = rdd.collect.mkString(" ")

        println(phrase)
    }

}
