// Zig - Easy

const std = @import("std");

pub fn main() void {
    // Use the `std.debug.print` function to print "Hello, world!" to the console.
    const message = "Hello, world!\n";
    std.debug.print("{s}", .{message});
}
