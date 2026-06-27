package co.istad.elearninga01m1.shared.exception;

public record FiledErrorResponse(
        String filed,
        String reason
) {
}