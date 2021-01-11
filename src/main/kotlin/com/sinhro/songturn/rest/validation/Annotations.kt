package com.sinhro.songturn.rest.validation

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD,AnnotationTarget.PROPERTY)
//@AnnotationResult(AnnotationValidatorResult.MinLengthError)
public annotation class MinLength(val minLength: Int)

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD,AnnotationTarget.PROPERTY)
public annotation class MaxLength(val maxLength: Int)

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD,AnnotationTarget.PROPERTY)
public annotation class MinMaxLength(val minLength: Int,val maxLength: Int)

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD,AnnotationTarget.PROPERTY)
public annotation class MinValue(val minValue: Int)

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD,AnnotationTarget.PROPERTY)
annotation class MaxValue(val maxValue: Int)

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD,AnnotationTarget.PROPERTY)
public annotation class MinMaxValue(val minValue: Int,val maxValue: Int)

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD,AnnotationTarget.PROPERTY)
public annotation class NotNull

